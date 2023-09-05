package hotel.ui;

import hotel.management.*;
import hotel.exceptions.InvalidReservationException;
import hotel.exceptions.RoomNotFoundException;
import hotel.services.ReservationService;
import hotel.services.RoomService;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HotelManagementApp {
    public static void main(String[] args) {
        RoomService roomService = new RoomService();
        roomService.addRoom(new StandardRoom(101, 100.0));
        roomService.addRoom(new DeluxeRoom(102, 150.0));
        roomService.addRoom(new SuiteRoom(103, 200.0));

        ReservationService reservationService = new ReservationService();

        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Make Reservation");
            System.out.println("2. View Reservations");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                try {
                    System.out.println("Enter guest information:");
                    System.out.print("Name: ");
                    String guestName = scanner.next();
                    if (!isValidName(guestName)) {
                        System.out.println("Invalid name. Please enter a valid name.");
                        continue;
                    }
                    System.out.print("Contact Number: ");
                    String contactNumber = scanner.next();
                    if (!isValidContactNumber(contactNumber)) {
                        System.out.println("Invalid contact number. Please enter a valid number.");
                        continue;                 // Go back to the main menu
                    }

                    Guest guest = new Guest(guestName, contactNumber);

                    System.out.println("Enter reservation details:");
                    System.out.print("Check-in Date (yyyy-MM-dd): ");
                    String checkInDateStr = scanner.next();
                    Date checkInDate = dateFormat.parse(checkInDateStr);
                    System.out.print("Check-out Date (yyyy-MM-dd): ");
                    String checkOutDateStr = scanner.next();
                    Date checkOutDate = dateFormat.parse(checkOutDateStr);

                    System.out.println("Select Room Type (Standard/Deluxe/Suite): ");
                    String roomType = scanner.next();

                    Room room = roomService.findAvailableRoom(roomType);
                    int reservationId = reservationService.getAllReservations().size() + 1;
                    Reservation reservation = new RoomReservation(reservationId, guest, checkInDate, checkOutDate, room);

                    reservationService.makeReservation(reservation);
                    System.out.println("Reservation successful!");
                } catch (ParseException e) {
                    System.out.println("Invalid date format. Use yyyy-MM-dd.");
                } catch (RoomNotFoundException e) {
                    System.out.println("Room not found: " + e.getMessage());
                } catch (InvalidReservationException e) {
                    System.out.println("Invalid reservation: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("An unexpected error occurred: " + e.getMessage());
                }
            } else if (choice == 2) {
                List<Reservation> reservations = reservationService.getAllReservations();
                if (reservations.isEmpty()) {
                    System.out.println("No reservations found.");
                } else {
                    System.out.println("Reservations:");
                    for (Reservation reservation : reservations) {
                        System.out.println(reservation.toString());
                        System.out.println("---------------");
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    public static boolean isValidName(String name) {
        // Name should contain only letters and spaces
        return name.matches("[a-zA-Z ]+");
    }

    public static boolean isValidContactNumber(String number) {
        // Contact number should contain only digits and may have a plus sign at the beginning
        return number.matches("^\\+?[0-9]+$");
    }
}