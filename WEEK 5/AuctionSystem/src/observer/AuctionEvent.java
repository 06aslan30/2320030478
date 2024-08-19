package observer;

public class AuctionEvent {
	 private String message;

	    public AuctionEvent(String message) {
	        this.message = message;
	    }

	    public String getMessage() {
	        return message;
	    }
	}
