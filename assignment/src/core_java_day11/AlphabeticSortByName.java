package core_java_day11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Contact {

	private String name;
	private String phoneNumber;
	private String email;

	public Contact(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Contact))
			return false;
		Contact contact = (Contact) o;
		return name.equalsIgnoreCase(contact.name) && phoneNumber.equals(contact.phoneNumber);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name.toLowerCase(), phoneNumber);
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + "]";
	}

}

public class AlphabeticSortByName {

	public static void main(String[] args) {

		Contact[] simContacts = { new Contact("Jeevan", "9876543210", "jeevan@sim.com"),
				new Contact("Nisha", "9123456789", "nisha@sim.com"),
				new Contact("Chitti", "9988776655", "chitti@sim.com") };

		// Contacts from Google
		Contact[] googleContacts = { new Contact("Jaya", "9876543210", "jaya@sim.com"),
				new Contact("Nivetha", "9123456789", "nivi@sim.com"),
				new Contact("Chitti", "9988776655", "chitti@sim.com") // Duplicate
		};

		// Contacts from Outlook
		Contact[] phoneContacts = { new Contact("Srinivas", "9876543210", "srinivas@sim.com"),
				new Contact("Chityala", "9123456789", "chityala@sim.com"),
				new Contact("Nivetha", "9123456789", "nivi@sim.com") };

		Set<Contact> uniqueContacts = new HashSet<>();
		Collections.addAll(uniqueContacts, simContacts);
		Collections.addAll(uniqueContacts, googleContacts);
		Collections.addAll(uniqueContacts, phoneContacts);

		// Convert to List and sort alphabetically by name

		List<Contact> sortedContact = new ArrayList<>(uniqueContacts);
		sortedContact.sort(Comparator.comparing(Contact::getName, String.CASE_INSENSITIVE_ORDER));

		// Display contacts

		System.out.println(" alphabecatilly sorted contacts : ");

		for (Contact c : sortedContact) {
			System.out.println(" - " + c);
		}
	}
}
