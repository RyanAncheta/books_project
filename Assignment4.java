/*********************************************************
//           Ryan Phil Ancheta                           //
//           N01598445                                   //
//           Assignment 4                                //
//                                                       //
//                                                       //
*********************************************************/
package assignment4;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	
	
	Scanner scanner = new Scanner(System.in);
	//prompt user for their name
	System.out.println("Enter your name: ");
	//variable that stores users input for customer name
	String cusName= scanner.nextLine();
	
	//creates new bill object with customers name input
	Bill bill = new Bill(cusName);
	
	//variable that stores users choice input
	int choice = 0;
	//loop for the main menu
	while(choice != 3) {
		System.out.println("Menu: \n1. Purchase Book\n2. Display Bill\n3. Exit");
		choice = scanner.nextInt();
		//just to consume new line
		scanner.nextLine();
		
		switch(choice) {
			//if users choose 1 to purchase book
			case 1:
				System.out.println("Type the book title: ");
				//variable that stores users input for book title
				String bookTitle = scanner.nextLine();
				System.out.println("Category: Fiction or NonFiction? ");
				//variable that stores users input for book category
				String bookCat = scanner.nextLine();
				
				//create new book Object
				Book book;
				//user chooses fiction that creates new fictionbook object
				//that holds user input for book title
				if (bookCat.equalsIgnoreCase("Fiction")) {
					book = new FictionBook(bookTitle);
					//user chooses nonfiction that creates new nonfictionbook object
					//that holds user input for book title
				}else if (bookCat.equalsIgnoreCase("NonFiction")) {
					book = new NonFictionBook(bookTitle);
				}else {
					//validates that users input is either fiction or nonfiction
					System.out.println("Invalid book Category");
					continue;
				}
			//calls method add to update customer bill
			bill.addBook(book);
			System.out.println("Book added to cart");
			break;
			
			//user choice is 2 which will generate customer bill
			case 2:
				bill.printBill();
				break;
			//user choice is 3 which will terminate the application
			case 3:
				System.out.println("Thanks for Shopping!");
				break;
			//error message if user input is not 1-3
			default:
				System.err.println("Invalid choice try again");
				
		}
	}
	}

}
