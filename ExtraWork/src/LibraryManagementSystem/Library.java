package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books; // This will hold a list of Book objects

	 // Constructor to initialize the list of books
	public Library() {
        this.books = new ArrayList<>();}

public ArrayList<Book> getBooks() {
	return books;
}

public void setBooks(ArrayList<Book> books) {
	this.books = books;
	
}

		public void returnBook(int ISBN) {
			for (Book book:books) {
				if(book.getISBN()==ISBN) {
					book.setCopies(book.getISBN()+ 1);
					return;
				}
			}

			
		}
		public Book findBook(String title) {
			for (Book book: books) {
				if(book.getTitle().equalsIgnoreCase(title))
					return book;
			}
		
			return null;
			
}
		
		public void addBook(Book book) {
	        books.add(book);
	    }
			
		public boolean borrowBook(int ISBN) {
		    for (Book book : books) {
		        if (book.getISBN() == ISBN) {
		            // Check if the book is available to borrow
		            if (book.getCopies() > 0) {
		                book.setCopies(book.getCopies() - 1); // Decrease the number of copies
		                return true; // Successfully borrowed
		            } else {
		                System.out.println("Sorry, the book is out of stock.");
		                return false; // Book is out of stock
		            }
		        }
		    }
		    System.out.println("Book not found.");
		    return false; // Book with this ISBN doesn't exist
		}
		
		 // Method to display all books in the library
	    public void displayBooks() {
	        for (Book book : books) {
	            System.out.println(book.bookDetails());
	        }
	    }

}

