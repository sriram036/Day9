package com.bridgelabz;

public class AddressBookMain {
    public static void main(String[] args) {
        Contact contact = new Contact();
        AddressBook addressBook = new AddressBook();
        addressBook.contactPerson1 = contact;

        contact.setFirstName("Sriram");
        contact.setLastName("Ravichandran");
        contact.setCity("Bangalore");
        contact.setState("Karnataka");
        contact.setZip(560032);
        contact.setPhoneNumber(1234567890);
        contact.setEmail("sri123@gmail.com");

        System.out.println(addressBook);

    }
}
