package hotel.services;

import hotel.exceptions.InvalidReservationException;
import hotel.management.Reservation;
import hotel.management.Room;
import hotel.management.RoomReservation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReservationService {
    private List<Reservation> reservations = new ArrayList<>();

    public void makeReservation(Reservation reservation) throws InvalidReservationException {
        if (reservationIsValid(reservation)) {
            reservations.add(reservation);
            RoomReservation roomReservation = (RoomReservation) reservation;
            roomReservation.getRoom().setAvailable(false);
        } else {
            throw new InvalidReservationException("Invalid reservation request.");
        }
    }

    private boolean reservationIsValid(Reservation reservation) {

        Date checkInDate = reservation.getCheckInDate();
        Date checkOutDate = reservation.getCheckOutDate();


        for (Reservation existingReservation : reservations) {

            if (existingReservation instanceof RoomReservation) {
                RoomReservation roomReservation = (RoomReservation) existingReservation;


                if (roomReservation.getRoom().equals(((RoomReservation) reservation).getRoom())) {

                    if (checkInDate.before(roomReservation.getCheckOutDate()) &&
                            checkOutDate.after(roomReservation.getCheckInDate())) {

                        return false;
                    }
                }
            }
        }


        return true;
    }




    public List<Reservation> getAllReservations() {
        return reservations;
    }
}