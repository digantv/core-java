package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_User {
	static ArrayList<User> userList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean canIKeepRunningTheProgram = true;

		while (canIKeepRunningTheProgram) {
			System.out.println("****Welcome to User Management****\n");
			System.out.println("What would you like to do ?");
			System.out.println("1. Add User");
			System.out.println("2. Edit User");
			System.out.println("3. Search User");
			System.out.println("4. Delete User");
			System.out.println("5. Quit");

			int optionSelectedByUser = scanner.nextInt();
			scanner.nextLine();

			if (optionSelectedByUser == 5) {
				System.out.println("Program Closed!!!");
				canIKeepRunningTheProgram = false;
			} else if (optionSelectedByUser == 1) {
				addUser();
				System.out.println();
			}
		}

		System.out.println("\nAfter While Loop");

		for (User user : userList) {
			System.out.println(user.userName);
		}
	}

	public static void addUser() {
		User newUser = new User();
		System.out.print("User Name: ");
		newUser.userName = scanner.nextLine();

		System.out.print("Login Name: ");
		newUser.loginName = scanner.nextLine();

		System.out.print("Password: ");
		newUser.password = scanner.nextLine();

		System.out.print("Confirm Password: ");
		newUser.confirmPassword = scanner.nextLine();

		System.out.print("User Role: ");
		newUser.userRole = scanner.nextLine();

		userList.add(newUser);
		System.out.println("\nUser added successfully!\n");
	}
}