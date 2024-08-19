package lsp;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Choose Bird (Sparrow/Ostrich): ");
        String birdType = scanner.nextLine();

        Bird bird = null;

        if (birdType.equalsIgnoreCase("Sparrow")) {
            bird = new Sparrow();
        } else if (birdType.equalsIgnoreCase("Ostrich")) {
            bird = new Ostrich();
        }

        if (bird != null) {
            try {
                bird.fly();
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Invalid bird type.");
        }

        scanner.close();
    }
}