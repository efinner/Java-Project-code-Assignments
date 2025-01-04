package LibraryManagementSystem;



public class Book {
String title;
String author;
int ISBN;
int copies;
//constructor

public Book(String title, String author, int ISBN, int copies) {
	this.setTitle(title);
	this.setAuthor(author);
	this.setISBN(ISBN);
	this.setCopies(copies);
	
}


public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getISBN() {
	return ISBN;
}

public void setISBN(int iSBN) {
	ISBN = iSBN;
}

public int getCopies() {
	return copies;
}

public void setCopies(int copies) {
	this.copies = copies;
}


//Method to display book details
public String bookDetails(){
	return title + author + ISBN;
	
}
}
