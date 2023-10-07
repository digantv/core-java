package array_learning;

import java.util.Scanner;

public class ArrayPrimitives {
	
	public static void main(String args[])
	{
		int[] rollnumber = new int[10];
	    for(int i=0;i<10;i++)
	    {
	    	rollnumber[i]=i+100;
	    	System.out.println(" ROLL NUMBER :" +i);
	    }
	      Scanner scan = new Scanner(System.in);
	      
	      String[] names = new String[10];
	      
	      System.out.println(" Enter names :");
	      for(int i=0;i<10;i++)
	      {
	    	  names[i] = scan.nextLine();
	    	 
	      }
	      
	      String[] address = new String[10];
	      
	      System.out.println(" Enter Address :");
	      for(int i=0;i<10;i++)
	      {
	    	  address[i] = scan.nextLine();
	      }
	      
	      for(int i=0;i<10;i++)
	      {
	      System.out.println(" Roll number: " +rollnumber[i]+" "+ " Name: "+names[i]+" "+ " Address: " +address[i]);
	}
}

}
