package srp;

public class SalaryCalci {
	public double calculateSalary(Employee employee) {
        double baseSalary = 30000;
        if (employee.getRole().equals("Manager")) {
            return baseSalary * 2;
        } else if (employee.getRole().equals("Developer")) {
            return baseSalary * 1.5;
        } else {
            return baseSalary;
        }
    }

}
