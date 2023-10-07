package array_learning;

public class ArrayPrimitive {
	public static void main(String[] args) {
		
		int[] rollNumber = new int[10];
		
		for (int i=0;i<10;i++) {
			rollNumber[i]=i+100;
		}
		
		String[] names = new String[10];
		names[0]="Rohit";
		names[1]="Nikita";
		names[2]="Abhijeet";
		names[3]="Amol";
		names[4]="Ganesh";
		names[5]="Chaitanya";
		names[6]="Gaurav";
		names[7]="Gayatri";
		names[8]="Govind";
		names[9]="Jyotiraditya";
		
		
		String[] address=new String[10];
		address[0]="Pune";
		address[1]="Buldhana";
		address[2]="Pune";
		address[3]="Mumbai";
		address[4]="Nashik";
		address[5]="Nagpur";
		address[6]="Nagar";
		address[7]="Beed";
		address[8]="Sambhajinagar";
		address[9]="Parbhani";
		
		for(int i=0;i<10;i++)
		{
		System.out.println("Rollno:"+rollNumber[i]+"  Name:"+names[i]+"  Address:"+ address[i]);	
		}


	}

}
