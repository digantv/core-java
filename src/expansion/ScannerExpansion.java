package expansion;

import java.util.Scanner;

public class ScannerExpansion {
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		int a= scanner.nextInt();
		int b= scanner.nextInt();
		int c= a+b;
		System.out.println(" expansion is " +c);

		int e= a*a+2*a*b+b*b;
		System.out.println(" square is "+e);
		
	    int i= a*a*a+3*a*a*b+3*a*b*b+b*b*b;
		System.out.println(" cube is "+i);
		
		int y= a*a*a*a+4*a*a*a*b+6*a*a*b*b+4*a*b*b*b+b*b*b*b;
		System.out.println(" quad is "+y);
		
		float p= a*a*a*a*a+5*a*a*a*a*b+10*a*a*a*b*b+10*a*a*b*b*b+5*a*b*b*b*b+b*b*b*b*b;
		System.out.println(" penta is "+p);
	
	}

}
