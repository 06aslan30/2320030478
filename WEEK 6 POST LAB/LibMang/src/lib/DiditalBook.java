package lib;

public class DiditalBook extends Book{
	 private String downloadLink;

	    public DiditalBook(String title, String author, String downloadLink) {
	        super(title, author);
	        this.downloadLink = downloadLink;
	    }

	    public String getDownloadLink() {
	        return downloadLink;
	    }
	}
	
