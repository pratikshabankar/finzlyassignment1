package coadingtest1;
class Room{
    private int roomNumber;
    private double capacity;
    private double pricePerNight;
    private boolean reserved;

     Room(int roomNumber, double capacity, double pricePerNight, boolean reserved) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.reserved = false;
    }

    public boolean isAvailable() {
        return !reserved;
    }
    public void makeReservation(){
        if(!reserved){
            reserved=true;
            System.out.println("room"+roomNumber+" is reserved");
        }
        else {
            System.out.println("room"+ roomNumber+" already reserved");
        }

    }
    public void makeReservation( String checkInDate, String checkOutDate){
        if (!reserved){
            reserved = true;
            System.out.println("Room " + roomNumber + " reserved from " + checkInDate + " to " + checkOutDate + ".");
        } else {
            System.out.println("Room " + roomNumber + " is already reserved.");
        }
        }
    public String toString() {
        return "Room " + roomNumber + ", Capacity: " + capacity + ", Price per Night: $" + pricePerNight;
    }


    }


public class MethodOverridingAndOverloading {
    public static void main(String[] args) {
        Room room1 = new Room(101, 2, 100.0,true);
        Room room2 = new Room(102, 4, 150.0,false);

        System.out.println(room1);
        System.out.println(room2);

        room1.makeReservation();
        room2.makeReservation("2023-08-20", "2023-08-25");

        System.out.println(room1);
        System.out.println(room2);
    }

}
