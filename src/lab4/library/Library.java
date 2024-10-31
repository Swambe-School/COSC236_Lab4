package lab4.library;

import java.util.HashSet;

public class Library{
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	/*
	 * The Library acts as a Creator by instantiating a list of items and members that its maintains throughout its life. It also calls
	 * delegates the act of returning and borrowing book to the library controller class rather than interacting with them directly.
	 */
	
	// Attributes:
	// private catalog (list of Book) 
	private HashSet<LibraryItem> listOfItems;
	// private members (list of Members)
	private HashSet<Member> listOfMembers;
	private LibrarianController lc;
	
	public Library() {
		listOfItems = new HashSet<>();
		listOfMembers = new HashSet<>();
		lc = new LibrarianController(this);
	}
	
	// DONE: implement functionality of Library class
	public void addBook(String title, String author) {
		Book b = new Book(title, author);
		listOfItems.add(b);
	}
	
	public void addMember(String name) {
		Member m = new Member(name);
		listOfMembers.add(m);
	}

	public void showAvailableItems() {
		listOfItems.forEach(o1 -> {
			if(o1.getAvailibility()) {
				System.out.println(o1.getInfo());
			}
		});
	}
	
	public void borrowItem(String m, String n) {
		lc.borrowItem(m, n);
	}
	
	public void returnItem(String m, String n) {
		lc.returnItem(m, n);
	}
	
	public void showMembers() {
		listOfMembers.forEach(o1 ->{
			System.out.println(o1.getName());
		});
	}
	
	public LibraryItem getItem(String title) {
		for(LibraryItem b: listOfItems) {
			if(b.getTitle().equals(title)) {
				return b;
			}
		}
		return null;
	}
	
	public Member getMember(String name) {
		for(Member m: listOfMembers) {
			if(m.getName().equals(name)) {
				return m;
			}
		}
		return null;
	}
	
}