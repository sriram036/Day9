package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        AddressBook addressBook = new AddressBook();
        addressBook.contactPerson1 = contact;

        System.out.println("Enter Person First Name : ");
        String firstName = scanner.next();
        contact.setFirstName(firstName);
        System.out.println("Enter Person Last Name : ");
        String lastName = scanner.next();
        contact.setLastName(lastName);
        System.out.println("Enter Person City : ");
        String city = scanner.next();
        contact.setCity(city);
        System.out.println("Enter Person State : ");
        String state = scanner.next();
        contact.setState(state);
        System.out.println("Enter Person Zipcode : ");
        int zipcode = scanner.nextInt();
        contact.setZip(zipcode);
        System.out.println("Enter person Phone Number : ");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(phoneNumber);
        System.out.println("Enter person Email ID : ");
        String email = scanner.next();
        contact.setEmail(email);

        System.out.println(addressBook);

    }
}
