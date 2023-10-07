package array_learning;

public class Array {
	
	public static void main(String args[])
	{
		int[] rollnumber = new int [10];
		for(int i =0;i<10;i++)
		{
			rollnumber[i]=i+100;
			
		}
		
		String[] names = new String [10];
		names[0]="Samruddhi";// homogeneous DATA contain only String 
		names[1]="Rutuja";
		names[2]="Priya";
		names[3]="Divya";
		names[4]="Sanjana";
		names[5]="Dhana";
		names[6]="Rucha";
		names[7]="Sayee";
		names[8]="Nakshtra";
		names[9]="Mruga";
		//names[10]="jay"; // extra data added
		
		String[] address = new String[10];
		address[0]="Satara";
		address[1]="Sangli";
		address[2]="Kolhapur";
		address[3]="Pune";
		address[4]="Karad";
		address[5]="Nagar";
		address[6]="Amravati";
		address[7]="Latur";
		address[8]="Udgir";
		address[9]="Ch.Sambhajinagar";
		 
		for(int i=0;i<10;i++)
		{
		System.out.println(" Roll number: " +rollnumber[i]+" "+ " Name: "+names[i]+" "+ " Address: " +address[i]);
		}
	}


}
