package lib;

public class LibService {
	private Borrowable item;

    public LibService(Borrowable item) {
        this.item = item;
    }

    public void performAction() {
        item.borrow();
    }
}