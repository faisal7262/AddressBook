package addressbook;

import java.util.Scanner;

public class MainClass {
	public static void main(String args[]) {
	
		int flag=1;
		while(flag == 1) {
			
			AddressBookManagerImplementation addressbookmanager = new AddressBookManagerImplementation();
			System.out.println("Welcome to Address Book");
			System.out.println("press 1 for Create New Address Book\npress 2 for Open Existing Address Book\n"
					+"press 3 for Save Address Book\npress 4 for Save As Address Book\npress 5 for Close Address Book"
					+ "\npress 6 for Quit");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				addressbookmanager.newAddressBook();
				break;
			case 2:
				addressbookmanager.openAddressBook();
				break;
			case 3:
				addressbookmanager.saveAddressBook();
				break;
			case 4:
				addressbookmanager.saveAsAddressBook();
				break;
			case 5:
				addressbookmanager.closeAddressBook();
				break;
			case 6:
				flag=0;
				break;
			default:
				System.out.println("Wrong data entered !");
			}
		}
		
	}
	
	AddressBookImplementation A1=new AddressBookImplementation();
}
