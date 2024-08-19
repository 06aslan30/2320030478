package dip;

public class MessageApplication {
	 private Message messageService;

	    public MessageApplication(Message messageService) {
	        this.messageService = messageService;
	    }

	    public void processMessages(String message, String receiver) {
	        this.messageService.sendMessage(message, receiver);
	    }
}
