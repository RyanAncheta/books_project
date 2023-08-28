package assignment4;

public class NonFictionBook extends Book {


		public NonFictionBook(String title) {
			super(title);
			setPrice();
			
		}
		//overriden method for setPrice that set the price
		//of all fiction books to 37.99
		@Override
		public void setPrice() {
			super.setPrice(37.99);
			
		}
		//overriden toString method from book class
	    //that will show "NonFiction"
		@Override
		public String toString() {
			return "Non-Fiction " + super.toString();
		}


}
