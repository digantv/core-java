package arraylist;
import java.util.Scanner;
import java.util.ArrayList;

public class UserManagement {

	static ArrayList<User> u1 = new ArrayList<User>();
	static int userCount = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean canIKeepRunningTheProgram = true;

		while (canIKeepRunningTheProgram == true) {

			System.out.println("****Welcome to User Management****");
			System.out.println("\n");

			System.out.println("What would you like to do ?");
			System.out.println("1. Add User");
			System.out.println("2. Edit User");
			System.out.println("3. Search User");
			System.out.println("4. Delete User");
			System.out.println("5. Quit");

			int optionSelectedByUser = sc.nextInt();

			if (optionSelectedByUser == 5) {
				System.out.println("Program Closed!!!");
				canIKeepRunningTheProgram = false;

			} else if (optionSelectedByUser == 1) {
				addUser();
				System.out.println("\n");
			}
		 
		}System.out.println("\n");
		System.out.println("After While Loop");
		for (int i=0;i<10;i++) 
			System.out.println(u1); 
	}
	public static void addUser() {

		Scanner sc = new Scanner(System.in);
		User u1 = new User(); // object of user class
		System.out.print("User Name: ");
		u1.userName = sc.nextLine();

		System.out.print("Login Name: ");
		u1.loginName = sc.nextLine();

		System.out.print("Password: ");
		u1.password = sc.nextLine();

		System.out.print("Confirm Password: ");
		u1.confirmPassword = sc.nextLine();

		System.out.print("User Role: ");
		u1.userRole = sc.nextLine();
		
		System.out.println("\n\n\nUser Name: " + u1.userName);
		System.out.println("Login Name: " + u1.loginName);
		System.out.println("Password: " + u1.password);
		System.out.println("Confirm Password: " + u1.confirmPassword);
		System.out.println("User Role: " + u1.userRole);
		userCount = userCount + 1;

	}
}
