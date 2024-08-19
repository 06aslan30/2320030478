package templater;
import observer.Auctioneer;

public abstract class AuctionTemplate {
	  protected Auctioneer auctioneer;

	    public AuctionTemplate(Auctioneer auctioneer) {
	        this.auctioneer = auctioneer;
	    }

	    public final void conductAuction() {
	        notifyBidders("Auction Starting");
	        startAuction();
	        endAuction();
	        notifyBidders("Auction Ended");
	    }

	    protected void notifyBidders(String message) {
	        auctioneer.notifyBidders(new observer.AuctionEvent(message));
	    }

	    protected abstract void startAuction();
	    protected abstract void endAuction();
	}
