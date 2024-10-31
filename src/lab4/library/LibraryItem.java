package lab4.library;


//Interface to allow extension for items such as AudioBooks or Magazines using Open closed principle
public interface LibraryItem {
	public String getInfo();
	public String getAuthor();
	public String getTitle();
	public boolean getAvailibility();
	public void returnItem();
	public void borrow();
}
