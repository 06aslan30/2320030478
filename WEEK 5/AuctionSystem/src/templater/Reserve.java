package templater;


public class Reserve extends AuctionTemplate {
	  private double reservePrice;

	public Reserve(observer.Auctioneer auctioneer, double reservePrice) {

		super(auctioneer);
        this.reservePrice = reservePrice;

}
	@Override
    protected void startAuction() {
        System.out.println("Reserve Auction: Bidding has started.");
        notifyBidders("Reserve Auction: Bidding has started. Reserve price: " + reservePrice);
    }

    @Override
    protected void endAuction() {
        System.out.println("Reserve Auction: Bidding has ended.");
        notifyBidders("Reserve Auction: Bidding has ended.");
    }
}