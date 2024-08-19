package dip;

public class SMS implements Message {

	@Override
	public void sendMessage(String message, String receiver) {
		 System.out.println("SMS sent to " + receiver + " with message: " + message);

	}

}
