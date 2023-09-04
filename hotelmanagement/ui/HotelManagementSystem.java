package hotelmanagement.ui;

import hotelmanagement.employees.Employee;
import hotelmanagement.employees.FrontDeskEmployee;
import hotelmanagement.employees.HousekeepingEmployee;
import hotelmanagement.exceptions.DuplicateEmployeeException;
import hotelmanagement.exceptions.InvalidTaskAssignmentException;
import hotelmanagement.management.EmployeeManagementSystem;

import java.util.Scanner;

public class HotelManagementSystem {
    private static final EmployeeManagementSystem employeeManagementSystem = new EmployeeManagementSystem();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hotel Management System");
            System.out.println("1. Hire Employee");
            System.out.println("2. Fire Employee");
            System.out.println("3. Update Employee Details");
            System.out.println("4. Assign Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            if (choice == 1) {
                hireEmployee();
            } else if (choice == 2) {
                fireEmployee();
            } else if (choice == 3) {
                updateEmployeeDetails();
            } else if (choice == 4) {
                assignTask();
            } else if (choice == 5) {
                System.out.println("Exiting the system. Goodbye!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void hireEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter employee category (Front Desk / Housekeeping): ");
        String category = scanner.nextLine();

        try {
            if ("Front Desk".equalsIgnoreCase(category)) {
                FrontDeskEmployee frontDeskEmployee = new FrontDeskEmployee(name, employeeId);
                employeeManagementSystem.hireEmployee("Front Desk", frontDeskEmployee);
            } else if ("Housekeeping".equalsIgnoreCase(category)) {
                HousekeepingEmployee housekeepingEmployee = new HousekeepingEmployee(name, employeeId);
                employeeManagementSystem.hireEmployee("Housekeeping", housekeepingEmployee);
            } else {
                System.out.println("Invalid category. Employee not hired.");
            }
        } catch (DuplicateEmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void fireEmployee() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee category: ");
        String category = scanner.nextLine();
        System.out.print("Enter employee ID to fire: ");
        int employeeId = scanner.nextInt();

        employeeManagementSystem.fireEmployee(category, employeeId);
        System.out.println("Employee with ID " + employeeId + " fired successfully.");
    }

    private static void updateEmployeeDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee category: ");
        String category = scanner.nextLine();
        System.out.print("Enter employee ID to update details: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter updated employee name: ");
        String updatedName = scanner.nextLine();

        Employee updatedEmployee = new Employee(updatedName, employeeId);
        employeeManagementSystem.updateEmployeeDetails(category, employeeId, updatedEmployee);
        System.out.println("Employee details updated successfully.");
    }

    private static void assignTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee category: ");
        String category = scanner.nextLine();
        System.out.print("Enter employee ID to assign a task: ");
        int employeeId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter task description: ");
        String task = scanner.nextLine();

        try {
            employeeManagementSystem.assignTask(category, employeeId, task);
            System.out.println("Task assigned successfully.");
        } catch (InvalidTaskAssignmentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}