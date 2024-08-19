package observer;

public class Concrete implements Bidder {

	private String name;

    public Concrete(String name) {
        this.name = name;
    }
	@Override
	public void update(AuctionEvent event) {
		 System.out.println("Bidder " + name + " received update: " + event.getMessage());

	}

}
