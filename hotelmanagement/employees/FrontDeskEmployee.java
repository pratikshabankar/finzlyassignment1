package hotelmanagement.employees;

public class FrontDeskEmployee extends Employee{
    public FrontDeskEmployee(String name, int employeeId) {
        super(name, employeeId);
    }

    public void checkInGuests() {
        System.out.println(getName() + " is checking in guests.");
    }
}
