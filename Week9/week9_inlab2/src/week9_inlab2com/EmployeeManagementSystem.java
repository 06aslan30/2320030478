package week9_inlab2com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", "HR", 70000));
        employees.add(new Employee(102, "Bob", "Engineering", 90000));
        employees.add(new Employee(103, "Charlie", "Marketing", 60000));
        employees.add(new Employee(104, "David", "HR", 65000));
        employees.add(new Employee(105, "Eve", "Engineering", 80000));

        // Sorting by Salary
        System.out.println("Employees sorted by Salary:");
        Collections.sort(employees, new SortBySalary());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sorting by Name
        System.out.println("\nEmployees sorted by Name:");
        Collections.sort(employees, new SortByName());
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        // Sorting by Department
        System.out.println("\nEmployees sorted by Department:");
        Collections.sort(employees, new SortByDepartment());
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
