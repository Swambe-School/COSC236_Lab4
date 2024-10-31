package lab4.library;

import java.util.HashSet;

public class Member {

// GRASP Principle: Information Expert and Low Coupling
// Can borrow and return books.
	/*
	 * The Member class maintains all of it's own information and only interacts with the book class through message coupling
	 */

private String name;
// private borrowedbBooks DONE: implement collection of borrowed books
private HashSet<LibraryItem>borrowedBooks;

public Member(String name) {
this.name = name;
borrowedBooks = new HashSet<>();
}

// DONE: implement functionality of Member class
public String getName() {
return name;
}
public void borrowBook(LibraryItem b) {
	this.borrowedBooks.add(b);
	b.borrow();
}

public void returnItem(LibraryItem b) {
	this.borrowedBooks.remove(b);
	b.returnItem();
}

public boolean hasItem(LibraryItem b) {
return this.borrowedBooks.contains(b);
}

public void getListOfItems() {
	System.out.println("Member: " + name);
	borrowedBooks.forEach(o1 -> {
	System.out.println(o1.getInfo());
});
}


}
