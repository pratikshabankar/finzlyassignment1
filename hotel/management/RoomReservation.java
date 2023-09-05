package hotel.management;

import java.util.Date;

public class RoomReservation extends Reservation {
    private Room room;
    private boolean isPaid;

    public RoomReservation(int reservationId, Guest guest, Date checkInDate, Date checkOutDate, Room room) {
        super(reservationId, guest, checkInDate, checkOutDate);
        this.room = room;
        this.isPaid = false;
    }

    public Room getRoom() {
        return room;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nRoom Information:\n" + room.toString() +
                "\nIs Paid: " + isPaid;
    }
}