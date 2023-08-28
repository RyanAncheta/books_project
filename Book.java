package assignment4;


abstract class Book {
	//fields of books
	private String title;
	private double price;
	
	//constructor that require book title as parameter
	public Book(String title) {
		this.title=title;
		
	}
	//gettters and setters
	public String getTitle() {
		return title;
	}


	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//abstract method for setPrice
	public abstract void setPrice();

	//toString method that return book title and price
	@Override
	public String toString() {
		return "- Title: " + getTitle() + " Price: $" + getPrice();
	}

	//equals method that compare two based on title parameter
	@Override
    public boolean equals(Object o) {
        if (this == o)
        	return true;
        if (o == null || getClass() != o.getClass()) 
        	return false;
        Book book = (Book) o;
        return title.equals(book.title);
    }

	
	

}
