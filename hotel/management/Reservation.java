package hotel.management;

import java.util.Date;
public class Reservation {
    private int reservationId;
    private Guest guest;
    private Date checkInDate;
    private Date checkOutDate;

    public Reservation(int reservationId, Guest guest, Date checkInDate, Date checkOutDate) {
        this.reservationId = reservationId;
        this.guest = guest;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public int getReservationId() {
        return reservationId;
    }

    public Guest getGuest() {
        return guest;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId +
                "\nGuest Information:\n" + guest.toString() +
                "\nCheck-in Date: " + checkInDate +
                "\nCheck-out Date: " + checkOutDate;
    }
}
