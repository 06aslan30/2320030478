package dip;

public class Email implements Message {

	@Override
	public void sendMessage(String message, String receiver) {
		 System.out.println("Email sent to " + receiver + " with message: " + message);
	}

}
