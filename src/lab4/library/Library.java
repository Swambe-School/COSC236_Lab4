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
	
	public Library() {
		listOfItems = new HashSet<>();
		listOfMembers = new HashSet<>();
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
	
	public void borrowItem(String b, String m) {
		LibraryItem n = getItem(b);
		Member p = getMember(m);
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
		LibraryItem n = getItem(b);
		Member p = getMember(m);
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