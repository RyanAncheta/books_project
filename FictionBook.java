package assignment4;

public class FictionBook extends Book{

	public FictionBook(String title) {
		super(title);
		setPrice();
		
	}
	//overriden method for setPrice that set the price
	//of all fiction books to 24.99
   @Override
	public void setPrice() {
		super.setPrice(24.99);
	}
	//overriden toString method from book class
    //that will show "Fiction" 
	@Override
	public String toString() {
		return "Fiction " + super.toString();
	}

}
