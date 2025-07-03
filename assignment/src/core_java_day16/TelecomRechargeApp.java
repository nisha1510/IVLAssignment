package core_java_day16;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Plan {

	private int id;
	private String description;
	private double price;

	public Plan(int id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Plan ID: " + id + " | ₹" + price + " - " + description;
	}

}

public class TelecomRechargeApp {

	private static final List<Plan> plans = Arrays.asList(new Plan(1, "1GB/day for 28 days", 209),
			new Plan(2, "2GB/day + 100 SMS/day for 56 days", 429),
			new Plan(3, "3GB/day + unlimited calls for 84 days", 599),
			new Plan(4, "Truly Unlimited + Netflix for 28 days", 799));

	private static void showPlans() {
		System.out.println("\nAvailable Plans:");
		plans.forEach(System.out::println);
	}

	private static void saveReceipt(String mobile, Plan plan, String method) {
		String fileName = "receipt_" + mobile + "_" + System.currentTimeMillis() + ".txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			writer.write("Recharge Receipt\n");
			writer.write("Date: " + LocalDateTime.now() + "\n");
			writer.write("Mobile: " + mobile + "\n");
			writer.write("Plan: " + plan.getDescription() + "\n");
			writer.write("Price: ₹" + plan.getPrice() + "\n");
			writer.write("Payment Method: " + method + "\n");
			System.out.println("Receipt saved as: " + fileName);
		} catch (IOException e) {
			System.out.println("Failed to save receipt.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Telecom Recharge App");
		System.out.println("Enter your 10 digit mobile number");
		String mobile = sc.nextLine().trim();
		if (!mobile.matches("\\d{10}")) {
			System.out.println("Invalid mobile number");
		}

		boolean continueRecharging = true;
		while (continueRecharging) {
			showPlans();

			System.out.println("Enter the plan Id to recharge : ");
			int planId = sc.nextInt();

			Optional<Plan> selected = plans.stream().filter(p -> p.getId() == planId).findFirst();

			if (selected.isPresent()) {
				Plan plan = selected.get();
				System.out.println("\nChoose a payment method:");
				System.out.println("1. UPI");
				System.out.println("2. Debit Card");
				System.out.println("3. Wallet");

				System.out.print("Enter option: ");
				int payMethod = sc.nextInt();
				sc.nextLine(); // consume newline

				String method = payMethod == 1 ? "UPI"
						: payMethod == 2 ? "Debit Card" : payMethod == 3 ? "Wallet" : "Unknown";
				if (!method.equals("Unknown")) {
					System.out.println("\nRecharge Successful for " + mobile);
					System.out.println("Plan: " + plan);
					System.out.println("Paid via: " + method);

					saveReceipt(mobile, plan, method);
				} else {
					System.out.println("Invalid payment method.");
				}
			} else {
				System.out.println("Invalid plan. Please try again.");
				continue;
			}

			System.out.print("\nWould you like to recharge another number? (yes/no): ");
			String choice = sc.nextLine().trim().toLowerCase();
			continueRecharging = choice.equals("yes");
		}
		sc.close();
		System.out.println("\nThank you for using the Recharge Portal!");

	}
}
