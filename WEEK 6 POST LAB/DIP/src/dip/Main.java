package dip;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Choose Message Service (Email/SMS): ");
	        String serviceType = scanner.nextLine();

	        Message messageService = null;

	        if (serviceType.equalsIgnoreCase("Email")) {
	            messageService = new Email();
	        } else if (serviceType.equalsIgnoreCase("SMS")) {
	            messageService = new SMS();
	        }

	        if (messageService != null) {
	            MessageApplication app = new MessageApplication(messageService);

	            System.out.print("Enter Receiver: ");
	            String receiver = scanner.nextLine();

	            System.out.print("Enter Message: ");
	            String message = scanner.nextLine();

	            app.processMessages(message, receiver);
	        } else {
	            System.out.println("Invalid service type.");
	        }

	        scanner.close();

	}

}
