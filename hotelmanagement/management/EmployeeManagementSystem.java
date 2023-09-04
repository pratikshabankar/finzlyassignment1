package hotelmanagement.management;

import hotelmanagement.employees.Employee;
import hotelmanagement.employees.FrontDeskEmployee;
import hotelmanagement.employees.HousekeepingEmployee;
import hotelmanagement.exceptions.DuplicateEmployeeException;
import hotelmanagement.exceptions.InvalidTaskAssignmentException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class EmployeeManagementSystem {
    private Map<String, List<Employee>> employeesByCategory = new HashMap<>();

    public void hireEmployee(String category, Employee employee) throws DuplicateEmployeeException {
        if (employeeAlreadyExists(category, employee)) {
            throw new DuplicateEmployeeException("Employee already exists in the category.");
        }

        employeesByCategory.computeIfAbsent(category, k -> new ArrayList<>()).add(employee);
    }

    public void fireEmployee(String category, int employeeId) {
        List<Employee> employees = employeesByCategory.get(category);
        if (employees != null) {
            employees.removeIf(employee -> employee.getEmployeeId() == employeeId);
        }
    }

    public void updateEmployeeDetails(String category, int employeeId, Employee updatedEmployee) {
        List<Employee> employees = employeesByCategory.get(category);
        if (employees != null) {
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getEmployeeId() == employeeId) {
                    employees.set(i, updatedEmployee);
                }
            }
        }
    }

    public void assignTask(String category, int employeeId, String task) throws InvalidTaskAssignmentException {
        List<Employee> employees = employeesByCategory.get(category);
        if (employees != null) {
            for (Employee employee : employees) {
                if (employee.getEmployeeId() == employeeId) {
                    if (category.equals("Front Desk")) {
                        if (!task.equalsIgnoreCase("check-in guests")) {
                            throw new InvalidTaskAssignmentException("Invalid task for Front Desk employee.");
                        }
                        ((FrontDeskEmployee) employee).checkInGuests();
                    } else if (category.equals("Housekeeping")) {
                        if (!task.equalsIgnoreCase("clean room")) {
                            throw new InvalidTaskAssignmentException("Invalid task for Housekeeping employee.");
                        }
                        ((HousekeepingEmployee) employee).cleanRoom();
                    }
                }
            }
        }
    }

    private boolean employeeAlreadyExists(String category, Employee employee) {
        List<Employee> employees = employeesByCategory.get(category);
        return employees != null && employees.stream().anyMatch(e -> e.getEmployeeId() == employee.getEmployeeId());
    }
}
