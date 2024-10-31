package lab4.library;


//Interface to allow extension for items such as AudioBooks or Magazines
public interface LibraryItem {
	public String getInfo();
	public String getTitle();
	public boolean getAvailibility();
	public void returnItem();
	public void borrow();
}
