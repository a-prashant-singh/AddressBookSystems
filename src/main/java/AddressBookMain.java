import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook=new AddressBook();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Choose the option : ");
        int option;
        String op = "";
        do {
            System.out.println("Press 1 for adding contact details: ");
            System.out.println("Press 2 for Editing contact details: ");
            System.out.println("Press 3 for deleting contact details: ");
            System.out.println("Press 4 for adding multiple contact details: ");
            System.out.println("Press 5 for adding new Address Book : ");
            System.out.println("Press 6 for searching by city or state : ");
            System.out.println("Press 7 for View by city or state : ");
            System.out.println("Press 8 for Count of contact by city or state : ");
            System.out.println("Press 9 for sorting the contact by name : ");
            System.out.println("Press 10 for sorting the contact by city, state or zip : ");
            System.out.println("Press 0 for display contact details: ");
            option=scanner.nextInt();
            if(option==1)
            {
               addressBook.addContact();
            }
            if(option==2)
            {
                addressBook.editContact();
            }
            if(option==3)
            {
                addressBook.deleteContact();
            }
            if(option==4)
            {
                addressBook.addMultipleContacts();
            }
            if(option==5)
            {
                addressBook.addAddressBook();
            }
            if(option==6)
            {
                addressBook.searchByCityOrState();
            }
            if(option==7)
            {
                addressBook.viewByCityOrState();
            }
            if(option==8)
            {
                addressBook.countByCityOrState();
            }
            if(option==9)
            {
                addressBook.sortByName();
            }
            if(option==10)
            {
                addressBook.sortByCityStateZip();
            }
            if(option==0)
            {
                addressBook.showContacts();
            }

            System.out.println("Do you want to continue: (yes/no) : ");
            op=scanner.next();
        }while(op.equalsIgnoreCase("yes"));

    }
}
