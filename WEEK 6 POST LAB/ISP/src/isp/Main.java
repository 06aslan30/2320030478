package isp;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Choose Worker (Human/Robot): ");
	        String workerType = scanner.nextLine();

	        if (workerType.equalsIgnoreCase("Human")) {
	            Human human = new Human();
	            human.work();
	            human.eat();
	        } else if (workerType.equalsIgnoreCase("Robot")) {
	            Robot robot = new Robot();
	            robot.work();
	        } else {
	            System.out.println("Invalid worker type.");
	        }

	        scanner.close();
	    }
}
	


