package lab4.library;

import java.util.HashSet;

public class Member {

// GRASP Principle: Information Expert and Low Coupling
// Can borrow and return books.

private String name;
// private borrowedbBooks DONE: implement collection of borrowed books
private HashSet<Book>borrowedBooks;

public Member(String name) {
this.name = name;
borrowedBooks = new HashSet<>();
}

// DONE: implement functionality of Member class
public String getName() {
return name;
}
public void borrowBook(Book b) {
this.borrowedBooks.add(b);
b.borrowBook();
}

public void returnBook(Book b) {
this.borrowedBooks.remove(b);
b.returnBook();
}

public boolean hasBook(Book b) {
return borrowedBooks.contains(b);
}

public void getListOfBooks() {
System.out.println("Member: " + name);
borrowedBooks.forEach(o1 -> {
System.out.println(o1.getInfo());
});
}


}
