package srp;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Role (Manager/Developer): ");
        String role = scanner.nextLine();

        Employee employee = new Employee(name, role);
        SalaryCalci salaryCalculator = new SalaryCalci();

        double salary = salaryCalculator.calculateSalary(employee);
        System.out.println(employee.getName() + "'s Salary: $" + salary);

        scanner.close();
    }

}
