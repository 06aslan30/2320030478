package lib;

public class BorrowingProcess {
	  private Borrowable item;
	    private Member member;

	    public BorrowingProcess(Borrowable item, Member member) {
	        this.item = item;
	        this.member = member;
	    }

	    public void borrowItem() {
	        System.out.println(member.getName() + " is borrowing the item.");
	        item.borrow();
	    }

	    public void returnItem() {
	        System.out.println(member.getName() + " is returning the item.");
	        item.returnItem();
	    }
}
