package ocp;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Choose Shape (Rectangle/Circle): ");
		        String shapeType = scanner.nextLine();

		        Shape shape = null;

		        if (shapeType.equalsIgnoreCase("Rectangle")) {
		            System.out.print("Enter Width: ");
		            double width = scanner.nextDouble();
		            System.out.print("Enter Height: ");
		            double height = scanner.nextDouble();
		            shape = new Rectangle(width, height);
		        } else if (shapeType.equalsIgnoreCase("Circle")) {
		            System.out.print("Enter Radius: ");
		            double radius = scanner.nextDouble();
		            shape = new Circle(radius);
		        }

		        if (shape != null) {
		            System.out.println("Area: " + shape.calculateArea());
		        } else {
		            System.out.println("Invalid shape type.");
		        }

		        scanner.close();
		    }
		}