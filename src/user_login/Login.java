package user_login;

import java.util.Scanner;

public class Login {
	
	public static void main(String args[])
	{
		System.out.println("***WELCOME TO LOGIN PAGE***");
		
		Scanner scan = new Scanner(System.in);                               
		
		 String Password1 =  "admin123" ;
		
		System.out.println(" Enter User Name : ");
		String name = scan.nextLine();
		name = name.toLowerCase();      // for case insensitive
		
		System.out.println(" Enter User Password : ");
		String Password = scan.nextLine();
		
		if(  Password.equals( Password1))  //.equals() means compare the contents between the string
		{
			System.out.println(" LOGIN SUCCESSFUL ");
		}
		else 
		{
			System.out.println(" LOGIN FAILED ");
		}
		scan.close(); // close scan process
	}

}
