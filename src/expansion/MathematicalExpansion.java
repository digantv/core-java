package expansion;

public class MathematicalExpansion {
	
	public static void main(String args[])
	{
		int c = addition( 34 ,45);
		System.out.println(c);
		int d = substraction(34,87);
		System.out.println(d);
		float e = division(45.89f,98.34f);
		System.out.println(e);
		int h= multiplication(56,89);
		System.out.println(h);
		}
	public static int addition(int a ,int b)
	{
		return a+b;
	}
	public static int substraction(int a ,int b )
	{
		return a-b;
	}
	public static float division(float a,float b)
	{
		return a/b;
	}
	public static int multiplication (int a,int b)
	{
		return a*b;
	}


}
