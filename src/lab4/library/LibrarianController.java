package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	private Library l;
	
	public LibrarianController(Library l) {
		this.l = l;
	}
	
	// TODO: implement functionality of Member class
	public void borrowBook(String b, String m) {
		Book n = l.getBook(b);
		Member p = l.getMember(m);
		if(p == null) {
			System.out.println(m + "is not a member of the library");
			return;
		}else if(n == null) {
			System.out.println("The Library does not have " + b + " in stock.");
		}else if(!n.getAvailibility()) {
			System.out.println(n.getTitle() + " is not available for borrowing at this time.");
		}else{
			p.borrowBook(n);
		}
	}
	
	public void returnBook(String b, String m) {
		Book n = l.getBook(b);
		Member p = l.getMember(m);
		if(p == null) {
			System.out.println(m + "is not a member of the library");
			return;
		}else if(n == null) {
			System.out.println("The Library does not have " + b + " in stock.");
		}else if(!p.hasBook(n)) {
			System.out.println("Member: "+ p.getName() + "has not borrowed " + n.getTitle() + ".");
		}else{
			p.returnBook(n);
		}
	}
}
