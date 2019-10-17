public class Book {
	private String BookID;
	private String BookTitle;
	private String BookAuthor;
	private String BookReleaseYear;
	private String BookType;
	
	public Book(){
		
	}
	
	public Book(String bookID, String bookTitle, String bookAuthor, String bookReleaseYear, String bookType) {
		super();
		BookID = bookID;
		BookTitle = bookTitle;
		BookAuthor = bookAuthor;
		BookReleaseYear = bookReleaseYear;
		BookType = bookType;
	}
	
	public Book(String bookTitle, String bookAuthor, String bookReleaseYear, String bookType) {
		super();
		BookTitle = bookTitle;
		BookAuthor = bookAuthor;
		BookReleaseYear = bookReleaseYear;
		BookType = bookType;
	}
	
	public String getBookID() {
		return BookID;
	}
	public void setBookID(String bookID) {
		BookID = bookID;
	}
	public String getBookTitle() {
		return BookTitle;
	}
	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return BookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}
	public String getBookReleaseYear() {
		return BookReleaseYear;
	}
	public void setBookReleaseYear(String bookReleaseYear) {
		BookReleaseYear = bookReleaseYear;
	}

	public String getBookType() {
		return BookType;
	}

	public void setBookType(String bookType) {
		BookType = bookType;
	}
	
		
	
	
}
