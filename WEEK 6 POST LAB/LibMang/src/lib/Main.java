package lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {   
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		  List<Book> books = new ArrayList<>();
	        List<LibraryMem> members = new ArrayList<>();

	        // Setup books and members
	        setupBooksAndMembers(books, members);

	        while (true) {System.out.println("\nLibrary Management System");
            System.out.println("1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    borrowBook(members, books);
                    break;
                case 2:
                    returnBook(members, books);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void setupBooksAndMembers(List<Book> books, List<LibraryMem> members) {
        System.out.println("Setup Books:");
        while (true) {
            System.out.print("Enter book title (or type 'done' to finish): ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("done")) break;

            System.out.print("Enter book author: ");
            String author = scanner.nextLine();

            books.add(new Book(title, author));
        }

        System.out.println("Setup Members:");
        while (true) {
            System.out.print("Enter member name (or type 'done' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Enter member ID: ");
            int memberId = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            members.add(new LibraryMem(name, memberId));
        }
    }

    private static void borrowBook(List<LibraryMem> members, List<Book> books) {
        if (members.isEmpty() || books.isEmpty()) {
            System.out.println("No members or books available.");
            return;
        }

        System.out.println("Select a member:");
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
        System.out.print("Enter member number: ");
        int memberNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (memberNumber < 1 || memberNumber > members.size()) {
            System.out.println("Invalid member number.");
            return;
        }

        LibraryMem selectedMember = members.get(memberNumber - 1);

        System.out.println("Available books:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.isAvailable()) {
                System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor());
            }
        }
        System.out.print("Enter book number to borrow: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (bookNumber < 1 || bookNumber > books.size()) {
            System.out.println("Invalid book number.");
            return;
        }

        Book selectedBook = books.get(bookNumber - 1);
        if (selectedBook.isAvailable()) {
            selectedMember.borrowBook(selectedBook);
        } else {
            System.out.println("The book is not available.");
        }
    }

    private static void returnBook(List<LibraryMem> members, List<Book> books) {
        if (members.isEmpty() || books.isEmpty()) {
            System.out.println("No members or books available.");
            return;
        }

        System.out.println("Select a member:");
        for (int i = 0; i < members.size(); i++) {
            System.out.println((i + 1) + ". " + members.get(i).getName());
        }
        System.out.print("Enter member number: ");
        int memberNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (memberNumber < 1 || memberNumber > members.size()) {
            System.out.println("Invalid member number.");
            return;
        }

        LibraryMem selectedMember = members.get(memberNumber - 1);

        System.out.println("Borrowed books:");
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (!book.isAvailable()) {
                System.out.println((i + 1) + ". " + book.getTitle() + " by " + book.getAuthor());
            }
        }
        System.out.print("Enter book number to return: ");
        int bookNumber = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (bookNumber < 1 || bookNumber > books.size()) {
            System.out.println("Invalid book number.");
            return;
        }

        Book selectedBook = books.get(bookNumber - 1);
        if (!selectedBook.isAvailable()) {
            selectedMember.returnBook(selectedBook);
        } else {
            System.out.println("The book was not borrowed.");
        }
    }
}