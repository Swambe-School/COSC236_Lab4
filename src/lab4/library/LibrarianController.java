package lab4.library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	/*
	 * The LibrarianController class delegates the acts of flagging if a book or member are present in the library to the respective classes 
	 * rather than directly modifying the internal attributes of the classes.
	 */
	private Library l;
	
	public LibrarianController(Library l) {
		this.l = l;
	}
	
	// TODO: implement functionality of Member class
	public void borrowItem(String b, String m) {
		LibraryItem n = l.getItem(b);
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
	
	public void returnItem(String b, String m) {
		LibraryItem n = l.getItem(b);
		Member p = l.getMember(m);
		if(p == null) {
			System.out.println(m + "is not a member of the library");
			return;
		}else if(n == null) {
			System.out.println("The Library does not have " + b + " in stock.");
		}else if(!p.hasItem(n)) {
			System.out.println("Member: "+ p.getName() + "has not borrowed " + n.getTitle() + ".");
		}else{
			p.returnItem(n);
		}
	}
}
