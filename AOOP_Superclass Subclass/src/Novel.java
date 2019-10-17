import java.util.Scanner;

public class Novel extends Book {
	static Scanner scan = new Scanner(System.in);
	
	public Novel() {
		super();
		setBookType("Novel");
	}

	public Novel(String bookID, String bookTitle, String bookAuthor, String bookReleaseYear,String bookType) {
		super(bookID, bookTitle, bookAuthor, bookReleaseYear,bookType);
		// TODO Auto-generated constructor stub
	}


	public Novel(String bookTitle, String bookAuthor, String bookReleaseYear, String bookType) {
		super(bookTitle, bookAuthor, bookReleaseYear,bookType);
		// TODO Auto-generated constructor stub
	}
}
