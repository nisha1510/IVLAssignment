package core_java_day11;
/*
You are building a social networking app where each user should have a list of unique interests 
(e.g., "Reading", "Cooking", "Traveling").
Which Java Collection would you use to store these interests and why?
Write a code example to add interests for a user and ensure there are no duplicates
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SocialNetworkInterestApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, UserProfile> users = new HashMap<>();

		System.out.print("Enter number of users: ");
		int count = Integer.parseInt(sc.nextLine());

		for (int i = 1; i <= count; i++) {
			System.out.print("\nEnter name of " + i + " user : ");
			String name = sc.nextLine();

			System.out.print("Enter email: ");
			String email = sc.nextLine();

			UserProfile user = new UserProfile(name, email);

			System.out.print("How many interests to add for " + name + "? ");
			int interestCount = Integer.parseInt(sc.nextLine());

//			for (int j = 0; j < interestCount; j++) {
//				System.out.print("Enter interest: ");
//				String interest = sc.nextLine();
//				try {
//					user.addInterest(interest);
//				} catch (DuplicateInterestException e) {
//					System.out.println("[Error] " + e.getMessage());
//				}
//			}
			for (int j = 0; j < interestCount; j++) {
				while (true) {
					System.out.print("Enter interest: ");
					String interest = sc.nextLine();

					try {
						user.addInterest(interest);
						break; // Exit loop if interest is successfully added
					} catch (DuplicateInterestException e) {
						System.out.println("[Error] " + e.getMessage());
						System.out.print("Do you want to try a different interest? (yes/no): ");
						String choice = sc.nextLine().trim().toLowerCase();
						if (!choice.equals("yes")) {
							System.out.println("Skipping additional interest.");
							break; // Give the user the option to skip
						}
					}
				}
			}

			users.put(email, user);
		}

		// Display all profiles
		System.out.println("\n--- User Profiles ---");
		for (UserProfile user : users.values()) {
			user.showProfile();
			System.out.println();
		}

		sc.close();
	}
}
