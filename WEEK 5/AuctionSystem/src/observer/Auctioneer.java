package observer;
import java.util.ArrayList;
import java.util.List;


public class Auctioneer {
	 private List<Bidder> bidders = new ArrayList<>();

	    public void subscribe(Bidder bidder) {
	        bidders.add(bidder);
	    }

	    public void unsubscribe(Bidder bidder) {
	        bidders.remove(bidder);
	    }

	    public void notifyBidders(AuctionEvent event) {
	        for (Bidder bidder : bidders) {
	            bidder.update(event);
	        }
	    }
	}
