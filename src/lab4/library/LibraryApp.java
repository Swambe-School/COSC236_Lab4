package lab4.library;
//Simplified verion of Library Management System
public class LibraryApp {
/*
 private ArrayList<String> AvailableItems = new ArrayList<>();
 private HashMap<String, ArrayList<String>> memberBorrowedBooks = new HashMap<>();

 // Adds a book to the library catalog
 public void addBook(String bookName) {
     AvailableItems.add(bookName);
     System.out.println(bookName + " has been added to the catalog.");
 }

 // Adds a new member to the library (without a separate class)
 public void addMember(String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         memberBorrowedBooks.put(memberName, new ArrayList<>());
         System.out.println("Member " + memberName + " has been added.");
     } else {
         System.out.println("Member " + memberName + " already exists.");
     }
 }

 // Borrow a book from the library
 public void borrowItem(String bookName, String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         System.out.println("Member " + memberName + " not found.");
         return;
     }

     if (AvailableItems.contains(bookName)) {
         AvailableItems.remove(bookName);
         memberBorrowedBooks.get(memberName).add(bookName);
         System.out.println(memberName + " has successfully borrowed " + bookName);
     } else {
         System.out.println(bookName + " is either already borrowed or not available.");
     }
 }

 // Return a book to the library
 public void returnItem(String bookName, String memberName) {
     if (!memberBorrowedBooks.containsKey(memberName)) {
         System.out.println("Member " + memberName + " not found.");
         return;
     }

     if (memberBorrowedBooks.get(memberName).contains(bookName)) {
         memberBorrowedBooks.get(memberName).remove(bookName);
         AvailableItems.add(bookName);
         System.out.println(memberName + " has successfully returned " + bookName);
     } else {
         System.out.println(memberName + " didn't borrow " + bookName);
     }
 }

 // Show the available books in the library
 public void showAvailableItems() {
     System.out.println("Available Books:");
     for (String book : AvailableItems) {
         System.out.println(book);
     }
 }

//Show members of in the library
public void showMembers() {
   System.out.println("Library members:");
   for (String member : memberBorrowedBooks.keySet()) {
       System.out.println(member);
   }
}
 */ 
public static void main(String[] args) {
	
	 LibrarianController library = new LibrarianController(new Library());

	 System.out.println(" *** Library management system demo *** ");
	 
    // Adding some books to the catalog
	System.out.println("\n *** Adding \"Dune\" to the library:");
	library.addBook("Dune", "Frank Herbert");
	
	System.out.println("\n *** Adding \"1984\" to the library:");
	library.addBook("1984", "George Orwell"); 
	
	System.out.println("\n *** Adding \"Moby Dick\" to the library:");
    library.addBook("Moby Dick", "Herman Melville");

    // Show available books
    System.out.println("\n *** Show all books:");
    library.showAvailableItems();
    
    // Adding members
    System.out.println("\n *** Adding \"Alice\" to the library members");
    library.addMember("Alice");
    
    System.out.println("\n *** Adding \"Bob\" to the library members");
    library.addMember("Bob");

    // Show members
    System.out.println("\n *** Show all members");
    library.showMembers();
    
    // Borrow a book
    System.out.println("\n *** Alice borrows Dune:");
    library.borrowItem("Dune", "Alice");

    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableItems();

    System.out.println("\n *** Bob borrows 1984:");
    library.borrowItem("1984", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableItems();
    
    System.out.println("\nBob borrows Dune:");
    library.borrowItem("Dune", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableItems();
    
    // Return a book
    System.out.println("\n *** Alice returns Dune:");
    library.returnItem("Dune", "Alice");

    // Show available books after returning
    System.out.println("\n *** Show all books:");
    library.showAvailableItems();

    System.out.println("\n *** Bob borrows Dune:") ;
    library.borrowItem("Dune", "Bob");
    
    // Show available books after borrowing
    System.out.println("\n *** Show all books:");
    library.showAvailableItems();

	}
}