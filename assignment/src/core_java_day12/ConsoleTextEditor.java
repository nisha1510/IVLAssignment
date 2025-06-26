package core_java_day12;

import java.util.Scanner;
import java.util.Stack;

public class ConsoleTextEditor {
	
	private static Stack<String> undoStack = new Stack<>();
	private static Stack<String> redoStack = new Stack<>();
	private static String content = "";

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("\n=== Text Editor Menu ===");
			System.out.println("1. Type text");
			System.out.println("2. Undo");
			System.out.println("3. Redo");
			System.out.println("4. Show content");
			System.out.println("5. Exit");
			System.out.print("Enter choice: ");
			choice = Integer.parseInt(sc.nextLine());

			switch (choice) {
			case 1:
				System.out.print("Enter text to add: ");
				String newText = sc.nextLine();
				undoStack.push(content);
				content += newText;
				redoStack.clear(); // new action resets redo
				break;

			case 2:
				if (!undoStack.isEmpty()) {
					redoStack.push(content);
					content = undoStack.pop();
					System.out.println("↩️ Undone.");
				} else {
					System.out.println("Nothing to undo.");
				}
				break;

			case 3:
				if (!redoStack.isEmpty()) {
					undoStack.push(content);
					content = redoStack.pop();
					System.out.println("Redone.");
				} else {
					System.out.println("Nothing to redo.");
				}
				break;

			case 4:
				System.out.println("Content: " + content);
				break;

			case 5:
				System.out.println("Exiting editor...");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 5);
		sc.close();
	}
}