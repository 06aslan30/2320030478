package templater;

import observer.Auctioneer;

public class Standard extends AuctionTemplate {

	public Standard(Auctioneer auctioneer) {
		super(auctioneer);
	
	}

	 @Override
	    protected void startAuction() {
	        System.out.println("Standard Auction: Bidding has started.");
	        notifyBidders("Standard Auction: Bidding has started.");
	    }

	    @Override
	    protected void endAuction() {
	        System.out.println("Standard Auction: Bidding has ended.");
	        notifyBidders("Standard Auction: Bidding has ended.");
	    }
	}
