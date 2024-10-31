package lab4.library;

public class Book implements LibraryItem{

	// GRASP Principle: Information Expert
	/*
	 * The Book Class Fulfills the Information Expert principle by containing all of its knowledge internally
	 * and not directly interacting with any classes within its methods. It has no knowledge of the implementation of any other classes.
	 */
	// Manages its own state (available or borrowed).
	private String title;
	private String author;
	private boolean isAvailable;
	
	// DONE: implement Book functionality
	public Book(String title, String author){
		this.title = title;
		this.author = author;
		this.isAvailable = true;
	}

	public String getAuthor(){
		return author;
	}
	
	@Override
	public String getTitle(){
		return title;
	}

	@Override
	public String getInfo(){
		return "Title: " + getTitle() + " Written by: " + getAuthor();
	}
	
	@Override
	public boolean getAvailibility(){
		return isAvailable;
	}
	@Override
	public void returnItem(){
		this.isAvailable = true;
	}
	@Override
	public void borrow(){
		this.isAvailable = false;
	}
	
}
