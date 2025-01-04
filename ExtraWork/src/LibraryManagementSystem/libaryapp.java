package LibraryManagementSystem;

import java.util.Scanner;

public class libaryapp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        
        // Sample books for initial setup
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 123456, 5);
        Book book2 = new Book("1984", "George Orwell", 654321, 3);
        library.addBook(book1);
        library.addBook(book2);

        while (true) {
            // Display the menu
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Find Book");
            System.out.println("5. Display All Books");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    // Add a book
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    int ISBN = scanner.nextInt();
                    System.out.print("Enter number of copies: ");
                    int copies = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character

                    Book newBook = new Book(title, author, ISBN, copies);
                    library.addBook(newBook);
                    System.out.println("Book added successfully!");
                    break;

                case 2:
                    // Borrow a book
                    System.out.print("Enter ISBN of the book to borrow: ");
                    int borrowISBN = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character

                    if (library.borrowBook(borrowISBN)) {
                        System.out.println("You have borrowed the book.");
                    } else {
                        System.out.println("Sorry, the book is not available or out of stock.");
                    }
                    break;

                case 3:
                    // Return a book
                    System.out.print("Enter ISBN of the book to return: ");
                    int returnISBN = scanner.nextInt();
                    scanner.nextLine();  // Consume newline character

                    library.returnBook(returnISBN);
                    System.out.println("You have returned the book.");
                    break;

                case 4:
                    // Find a book by title
                    System.out.print("Enter book title to search: ");
                    String searchTitle = scanner.nextLine();

                    Book foundBook = library.findBook(searchTitle);
                    if (foundBook != null) {
                        System.out.println("Book found: " + foundBook.bookDetails());
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 5:
                    // Display all books in the library
                    library.displayBooks();
                    break;

                case 6:
                    // Exit
                    System.out.println("Exiting the library system...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
	
}
	}
}