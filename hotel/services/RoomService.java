package hotel.services;

import hotel.exceptions.RoomNotFoundException;
import hotel.management.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomService {
    private List<Room> rooms = new ArrayList<>();

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room findAvailableRoom(String roomType) throws RoomNotFoundException {
        for (Room room : rooms) {
            if (room.isAvailable() && room.getRoomType().equalsIgnoreCase(roomType)) {
                return room;
            }
        }
        throw new RoomNotFoundException("No available " + roomType + " room found.");
    }
}
