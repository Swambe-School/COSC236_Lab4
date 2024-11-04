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
	
	// DONE: implement functionality of Member class
	public void borrowItem(String b, String m) {
		l.borrowItem(b, m);
	}
	
	public void addBook(String title, String author) {
		l.addBook(title, author);
	}
	
	public void addMember(String name) {
		l.addMember(name);
	}
	
	public void showAvailableItems() {
		l.showAvailableItems();
	}
	
	public void returnItem(String b, String m) {
		l.returnItem(b, m);
	}
	
	public void getItem(String title) {
		l.getItem(title);
	}
	
	public void getMember(String name) {
		l.getMember(name);
	}
	
	public void showMembers() {
		l.showMembers();
	}
}
