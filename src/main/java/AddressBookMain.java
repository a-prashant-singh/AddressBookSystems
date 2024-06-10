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
            if(option==0)
            {
                addressBook.showContacts();
            }

            System.out.println("Do you want to continue: (yes/no) : ");
            op=scanner.next();
        }while(op.equalsIgnoreCase("yes"));

    }
}
