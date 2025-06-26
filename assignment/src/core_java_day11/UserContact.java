package core_java_day11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class UserContact {
	private String name;
	private String number;
	private String email;

	public UserContact(String name, String number, String email) {
		this.name = name;
		this.number = number;
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public String getEmail() {
		return email;
	}

	public String toString() {
		return "Name: " + name + ", Number: " + number + ", Email: " + email;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof UserContact))
			return false;
		UserContact other = (UserContact) o;
		return number.equals(other.number) && email.equals(other.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, email);
	}

	public static void main(String[] args) {
		Set<UserContact> contacts = new LinkedHashSet<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("How many contacts do you want to add? ");
		int count = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= count; i++) {
			System.out.println("\nEnter Contact Details for user " + i);

			System.out.print("Enter name: ");
			String name = sc.nextLine();

			String number;
			while (true) {
				System.out.print("Enter number: ");
				number = sc.nextLine();

				boolean numberExists = false;
				for (UserContact contact : contacts) {
					if (contact.getNumber().equals(number)) {
						numberExists = true;
						break;
					}
				}
				if (numberExists) {
					System.out.println("That number is already registered. Try another.");
				} else {
					break;
				}
			}

			String email;
			while (true) {
				System.out.print("Enter email: ");
				email = sc.nextLine();

				boolean emailExists = false;
				for (UserContact contact : contacts) {
					if (contact.getEmail().equalsIgnoreCase(email)) {
						emailExists = true;
						break;
					}
				}
				if (emailExists) {
					System.out.println("That email is already registered. Try another.");
				} else {
					break;
				}
			}

			UserContact contact = new UserContact(name, number, email);
			contacts.add(contact);
			System.out.println("Contact added!");
		}

		System.out.println("\nAll Contacts:");
		for (UserContact c : contacts) {
			System.out.println(c);
		}

		sc.close();

	}
}