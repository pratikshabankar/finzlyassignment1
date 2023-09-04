package hotelmanagement.employees;

public class HousekeepingEmployee extends Employee{
    public HousekeepingEmployee(String name, int employeeId) {
        super(name, employeeId);
    }

    public void cleanRoom() {
        System.out.println(getName() + " is cleaning a room.");
    }
}
