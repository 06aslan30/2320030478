package lib;

public class Book implements Borrowable {
	 private String title;
	    private String author;
	    private boolean isAvailable;

	    public Book(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    @Override
	    public void borrow() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println("Book borrowed: " + title);
	        } else {
	            System.out.println("Book is not available.");
	        }
	    }

	    @Override
	    public void returnItem() {
	        isAvailable = true;
	        System.out.println("Book returned: " + title);
	    }
	}