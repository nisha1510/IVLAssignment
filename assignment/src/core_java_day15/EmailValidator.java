package core_java_day15;

import java.util.Scanner;

public class EmailValidator {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name : ");
		String name = sc.nextLine();
		System.out.println("Enter your email : ");
		String email = sc.nextLine();
		
		 try {
	            User user = new User(name, email);
	            System.out.println("Registration successful for: " + user.getName());
	            System.out.println("Formatted Email: " + user.getEmail());
	        } catch (IllegalArgumentException e) {
	            System.out.println("Registration failed: " + e.getMessage());
	        }
	}
}
