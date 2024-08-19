package logging;
import java.util.Scanner;

public class MainClient {

		private static tring message;

		public static void main(String[] args) {
	        // Create handlers
	        LogHandler infoHandler = new InfoHandler();
	        LogHandler debugHandler = new DebugHandler();
	        LogHandler errorHandler = new ErrorHandler();

	        // Configure the chain of responsibility
	        infoHandler.setNextHandler(debugHandler);
	        debugHandler.setNextHandler(errorHandler);

	        // Create a logger
	        Logger logger = new Logger();

	        Scanner scanner = new Scanner(System.in);
	        boolean continueLogging = true;

	        while (continueLogging) {
	            System.out.println("Choose the log level:");
	            System.out.println("1. INFO");
	            System.out.println("2. DEBUG");
	            System.out.println("3. ERROR");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Consume the newline character

	            LogLevel logLevel = null;
	            switch (choice) {
	                case 1:
	                    logLevel = LogLevel.INFO;
	                    break;
	                case 2:
	                    logLevel = LogLevel.DEBUG;
	                    break;
	                case 3:
	                    logLevel = LogLevel.ERROR;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid log level.");
	                    continue;
	            }

	            System.out.print("Enter the log message: ");
	             String message = scanner.nextLine();

	            // Create a command for the chosen log level
	            Command logCommand = new LogCommand(infoHandler, logLevel);
	            logger.addCommand(logCommand);

	            // Execute the command
	            logger.processCommands();

	            System.out.print("Do you want to log another message? (yes/no): ");
	            String continueResponse = scanner.nextLine().trim().toLowerCase();
	            continueLogging = continueResponse.equals("yes");
	        }

	        scanner.close();
	    }
		
	
}
