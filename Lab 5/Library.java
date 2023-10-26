import java.util.*;

class Book {
/* 
 * 1. Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object. 
 * Create an ArrayList of type Book and store all book objects into collections and display all book details.

[Hint: Use advanced for loop to display all Books details]

Expected Output:

-- All Books --

Book [Book Id = 101, Book Name = Let Us C, Author Name = Yashvant P Kanitkar]

Book [Book Id = 102, Book Name = Head First Java, Author Name = Kathy Sierra]

*/
	private int bookId;
	private String bookName;
	private String authorName;
	
	//Constructor to initialize the Book class fields
	public Book(int bookId, String bookName, String authorName) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	//Getter for the Book fields which can be accessed from outside this class or the package
	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public String getAuthorName() {
		return authorName;
	}
	
}

//A public Library class which can add books to the arraylist of the book class
public class Library {
	public static void main(String[] args) {
		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(101, "Let Us C", "Yashvant P Kanitkar"));
		books.add(new Book(102, "Head First Java", "Kathy Sierra"));
		
		printBooks(books);
	}
	
	//method to display the books in the personalized format
	public static void printBooks(ArrayList<Book> books) {
		//Used enhanced for loop because we don't want to make any changes in the arraylist
		//we just want the particular place elements
		for(var v : books) {
			System.out.println("Book " + "[Book Id = " + v.getBookId() + ", Book Name = " + v.getBookName() + ", Author Name = " + v.getAuthorName() + "]");
		}
	}
}
