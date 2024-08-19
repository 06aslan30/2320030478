package lib;

public class LibraryMem extends Member implements MemberActions {
	 public LibraryMem(String name, int memberId) {
	        super(name, memberId);
	    }

	@Override
	public void borrowBook(Book book) {
		  System.out.println(getName() + " is borrowing " + book.getTitle());
	        book.borrow();

	}

	@Override
	public void returnBook(Book book) {
		 System.out.println(getName() + " is returning " + book.getTitle());
	        book.returnItem();
	    }


}
