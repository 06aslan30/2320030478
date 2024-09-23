import java.util.*;
import java.util.stream.Collectors;

public class LibraryManagement {
    private List<Book> books = new ArrayList<>();
    private Map<Integer, Member> members = new HashMap<>();
    private Queue<Loan> loans = new LinkedList<>();

    // Adding a book
    public void addBook(Book book) {
        books.add(book);
    }

    // Adding a member
    public void addMember(Member member) {
        members.put(member.getId(), member);
    }

    // Searching books by author using Stream API
    public List<Book> searchBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    // Searching books by genre using Stream API
    public List<Book> searchBooksByGenre(String genre) {
        return books.stream()
                .filter(book -> book.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    // Managing loans
    public void loanBook(Book book, Member member) {
        if (books.contains(book)) {
            loans.add(new Loan(book, member));
            books.remove(book); // Remove the book from available books list
        } else {
            System.out.println("Book not available");
        }
    }

    // Display all loans
    public void displayLoans() {
        loans.forEach(System.out::println);
    }

    // Display all books
    public void displayBooks() {
        books.forEach(System.out::println);
    }
    
    // Display all members
    public void displayMembers() {
        members.values().forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        LibraryManagement library = new LibraryManagement();

        // Adding books
        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction"));
        library.addBook(new Book("1984", "George Orwell", "Dystopian"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "Fiction"));

        // Adding members
        library.addMember(new Member(1, "Alice"));
        library.addMember(new Member(2, "Bob"));

        // Search functionality
        System.out.println("Books by George Orwell: " + library.searchBooksByAuthor("George Orwell"));
        System.out.println("Fiction Books: " + library.searchBooksByGenre("Fiction"));

        // Loan management
        library.loanBook(new Book("1984", "George Orwell", "Dystopian"), new Member(1, "Alice"));
        library.displayLoans();
    }
}
