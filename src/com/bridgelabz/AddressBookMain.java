package com.bridgelabz;
import java.util.Scanner;
public class AddressBookMain {

    AddressBook addressBook = new AddressBook();

    void getData(){

        Contact contact = new Contact();
        addressBook.contactPerson1 = contact;
        Scanner scanner = new Scanner(System.in);

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
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        AddressBookMain addressBookMain = new AddressBookMain();

        int choice;

        addressBookMain.getData();

        do {
            System.out.println("1. Edit");
            System.out.println("2. Display");
            System.out.println("3. Exit");
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice){
                case 1 : {
                    addressBookMain.getData();
                }break;
                case 2 : {
                    System.out.println(addressBookMain.addressBook);
                }break;
                case 3 : {
                    System.exit(0);
                }break;
                default : {
                    System.out.println("Wrong Choice! Please try again!");
                }
            }
        } while (choice != 3);
    }
}
