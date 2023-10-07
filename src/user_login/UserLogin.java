package user_login;

import java.util.Scanner;

public class UserLogin {
	
	public static void main(String args[])
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" Enter User Name :");
		String user = scan.nextLine();
		
		System.out.println(" Enter login Name : ");
		String employee = scan.nextLine();
		
		System.out.println(" Enter Password : ");
		String password = scan.nextLine();
		
		System.out.println(" Enter Confirm Password : ");
		String password1 = scan.nextLine();
		
		if(password.equals(password1))
		{
			System.out.println(" User Name is : " +user);
			System.out.println(" login Name is : " +employee);
		}
		else
		{
			System.out.println(" Password and Confirm Password are not equal ");
		}
		scan.close();
		
	}


}
