package assignment4;

public class Bill {
	//fields for bill class
	private String customerName;
	private Book[] books;
	private double bill;
	//field to use a counter for the book array
	private int bookQuantity;
	
	//parameterized constructor that requires customer name as parameter
	public Bill(String customerName) {
		this.customerName=customerName;
		//array of books that can hold up to 10 books
		this.books = new Book[10];
		this.bill = 0.0;
		this.bookQuantity = 0;
	}
	//method to add book purchased by customer
	public void addBook(Book book) {
		//validation for book capacity to not exceed 10
		if(bookQuantity < 10) {
			books[bookQuantity] = book;
			//to add bokk price to the bill
			bill+= book.getPrice();
			//incrementer for book counter
			bookQuantity++;
		//if >10 books prints error message
		}else{
			System.err.println("Book capacity reached!");
			
		}
		
	}
	//method to print bill details 
	public void printBill() {
		//to restrict generating bill if books is not atleast 5
		if(bookQuantity<5) {
			System.err.println("We require atleast 5 books to generate bill");
			return;
		}
			//for customer details
			System.out.println("Name: " + customerName);
			//cart details(books added to cart)
			System.out.println("Cart: ");
			//loop for book array and to get book details
			for(int i=0; i < bookQuantity; i++) {
				System.out.println("* " + books[i]);
			}
			//total ammount
			System.out.println("Total: $" + bill);
		}

}
