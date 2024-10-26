package lab4.library;

import java.util.HashSet;

public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	// Attributes:
	// private catalog (list of Book) 
	private HashSet<Book> listOfBooks;
	// private members (list of Members)
	private HashSet<Member> listOfMembers;
	private LibrarianController lc;
	
	public Library() {
		listOfBooks = new HashSet<>();
		listOfMembers = new HashSet<>();
		lc = new LibrarianController(this);
	}
	
	// TODO: implement functionality of Library class
	public void addBook(String title, String author) {
		Book b = new Book(title, author);
		listOfBooks.add(b);
	}
	
	public void addMember(String name) {
		Member m = new Member(name);
		listOfMembers.add(m);
	}

	public void showAvailableBooks() {
		listOfBooks.forEach(o1 -> {
			if(o1.getAvailibility()) {
				System.out.println(o1.getInfo());
			}
		});
	}
	
	public void borrowBook(String m, String n) {
		lc.borrowBook(m, n);
	}
	
	public void returnBook(String m, String n) {
		lc.returnBook(m, n);
	}
	
	public void showMembers() {
		listOfMembers.forEach(o1 ->{
			System.out.println(o1.getName());
		});
	}
	
	public Book getBook(String title) {
		for(Book b: listOfBooks) {
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