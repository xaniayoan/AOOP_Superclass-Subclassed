import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//make Novel
		Novel nv = new Novel();
		System.out.printf("[Insert Novel\'s ID]	");
		String nid = scan.nextLine();
		nv.setBookID(nid);
		System.out.printf("[Insert Novel\'s Title]	");
		String ntitle = scan.nextLine();
		nv.setBookTitle(ntitle);
		System.out.printf("[Insert Novel\'s Author]	");
		String nauthor = scan.nextLine();
		nv.setBookAuthor(nauthor);
		System.out.printf("[Insert Novel\'s Released]	");
		String nreleased = scan.nextLine();
		nv.setBookReleaseYear(nreleased);
		
		System.out.println();
		//make Magazine
		Magazine mg = new Magazine();
		System.out.printf("[Insert Novel\'s ID]	");
		String mid = scan.nextLine();
		mg.setBookID(mid);
		System.out.printf("[Insert Novel\'s Title]	");
		String mtitle = scan.nextLine();
		mg.setBookTitle(mtitle);
		System.out.printf("[Insert Novel\'s Author]	");
		String mauthor = scan.nextLine();
		mg.setBookAuthor(mauthor);
		System.out.printf("[Insert Novel\'s Released]	");
		String mreleased = scan.nextLine();
		mg.setBookReleaseYear(mreleased);
		
		System.out.println("==================================");
		System.out.println(nv.getBookType());
		System.out.println(nv.getBookID());
		System.out.println(nv.getBookTitle());
		System.out.println(nv.getBookAuthor());
		System.out.println(nv.getBookReleaseYear());
		System.out.println();
		System.out.println(mg.getBookType());
		System.out.println(mg.getBookID());
		System.out.println(mg.getBookTitle());
		System.out.println(mg.getBookAuthor());
		System.out.println(mg.getBookReleaseYear());
		scan.close();
	}

}
