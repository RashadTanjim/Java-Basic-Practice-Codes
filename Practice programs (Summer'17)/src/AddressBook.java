/*
import java.io.*;
import java.util.Scanner;

public class AddressBook {

    private Contact[] friends; // An array of Contacts - each stores info for one friend
    private int numfriends; // Number of friends currently in AddressBook

    // Create an empty AddressBook
    public AddressBook() {
		friends = new Contact[10];
		numfriends = 0;
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(Contact c) {
		friends[numfriends] = c;
		numfriends++;
    }

    // Print out info on all contacts using method Contact class.
    public void printContacts() {
		for (int i=0;i<numfriends;i++)
	    	friends[i].printContact();
    }

    // Returns the number of friends currently in AddressBook
    public int numContacts() {
		return numfriends;
    }

    // Returns a non-neg integer if a Contact with name s exists corresponding
    // to which place in the array friends the Contact is stored. Returns -1
    // otherwise.
    private int haveContact(String s) {
	
		for (int i=0;i<numfriends;i++)
	    	if (friends[i].getName().equals(s))
				return i;
		return -1;
    }

    // Deletes a contact with name s, if one is in the AddressBook.
    public void deleteContact(String s) {
	
		int place = haveContact(s);
		if (place >= 0) {
	    	friends[place] = friends[numfriends-1];
	    	numfriends--;
		}
    }

    public static void main(String[] args) throws IOException {

	
		Scanner stdin = new Scanner(System.in);
	
		// Instantiate AddressBook object
		AddressBook blackbook = new AddressBook();

 		// Menu driven loop.
		menu();
		int choice = stdin.nextInt();
	
	
		while (choice!=5) {
	    
	    	// Only adds contact if there is room in AddressBook blackbook.
	    	if (choice == 1) {
			
				if (blackbook.numContacts() < 10) {
		    
		    		//Reads in all appropriate information.");
		    		System.out.println("Enter your friend\'s name:");
		    		String name = stdin.next();
		    		System.out.println("Enter their age.");
		    		int age = stdin.nextInt();
		    		System.out.println("Enter their phone number.");
		    		int number = stdin.nextInt();
		    		System.out.println("Enter the birthday, month on one line, then day on the next.");
		    		int mon = stdin.nextInt();
		    		int day = stdin.nextInt();

		    		// Uses information to create Contact object, which is
		    		// a parameter to the addContact method.
		    		blackbook.addContact(new Contact(name,age,number,mon,day));
				}
				else
		    		System.out.println("Sorry, can not add anyone, your blackbook is full.");
	    	}
	    	
	    	// Implements rest of the choices by calling appropriate AddressBook methods on blackbook.
	    	else if (choice == 2) {
				System.out.println("What is the name of the contact you want to delete?");
				String name = stdin.next();
				blackbook.deleteContact(name);
	    	}
	    	else if (choice == 3) {
				System.out.println("You have " + blackbook.numContacts() + " contacts.");
	    	}
	    	else if (choice == 4) {
				blackbook.printContacts();
	    	}
	    	else if (choice !=5) {
				System.out.println("Sorry, that was an invalid menu choice, try again.");
	    	}
	    
	    	menu();
	    	choice = stdin.nextInt();
		}
	
    }

    public static void menu() {
		System.out.println("1.Add a new contact to your address book.");
		System.out.println("2.Delete a contact from your address book.");
		System.out.println("3.Print out the number of contacts you have.");
		System.out.println("4.Print out information of all of your contacts.");
		System.out.println("5.Quit.");
		System.out.println("Enter your menu choice:");
    }
}
*/