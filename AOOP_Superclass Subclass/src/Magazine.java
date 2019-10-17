import java.util.Scanner;

public class Magazine extends Book{
	static Scanner scan = new Scanner(System.in);

	public Magazine() {
		super();
		setBookType("Magazine");
	}

	public Magazine(String bookID, String bookTitle, String bookAuthor, String bookReleaseYear, String bookType) {
		super(bookID, bookTitle, bookAuthor, bookReleaseYear, bookType);
		// TODO Auto-generated constructor stub
	}

	public Magazine(String bookTitle, String bookAuthor, String bookReleaseYear, String bookType) {
		super(bookTitle, bookAuthor, bookReleaseYear, bookType);
		// TODO Auto-generated constructor stub
	}
	
	
}
