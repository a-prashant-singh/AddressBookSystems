import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;
    Scanner scanner = new Scanner(System.in);

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact() {


        System.out.println("Enter contact details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("Zip: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);

        contacts.add(contact);
    }

    public void showContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void editContact() {
        System.out.print("Enter the first name of the contact to edit: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name of the contact to edit: ");
        String lastName = scanner.nextLine();

        System.out.println("Enter new contact details:");
        System.out.print("First Name: ");
        String newFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String newLastName = scanner.nextLine();
        System.out.print("Address: ");
        String newAddress = scanner.nextLine();
        System.out.print("City: ");
        String newCity = scanner.nextLine();
        System.out.print("State: ");
        String newState = scanner.nextLine();
        System.out.print("Zip: ");
        String newZip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String newPhoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String newEmail = scanner.nextLine();

        Contact newContactDetails = new Contact(newFirstName, newLastName, newAddress, newCity, newState, newZip, newPhoneNumber, newEmail);

        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                contacts.set(i, newContactDetails);
                return;
            }
        }
        System.out.println("Contact not found.");
    }

}
