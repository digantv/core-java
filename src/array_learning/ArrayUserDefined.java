package array_learning;

public class ArrayUserDefined {
	
	public static void main(String args[])
	{
		Student[] student = new Student[10];
		
		for(int i=0;i<10;i++)
		{
			student[i] = new Student();
			student[i].rollNumber = 100+i;
			student[i].name = " Student "+i;
		    student[i].address = " Address "+i;
			student[i].email = " Email "+i;
			student[i].mobile = " Mobile "+i;
		}
		
		for(int i=0;i<10;i++)
		{
			System.out.println("RollNumber:"+ student[i].rollNumber +" Name :" + student[i].name +" Address :"+ student[i].address+" Email :" + student[i].email+
					" Mobile :" + student[i].mobile);
		}
	}

}
