package expansion;

public class BinomialExpansion {
	

	public static void main(String args[])
			{
		int c = expansion(56,61);
		System.out.println(c);
		int d = expansionsquare(85,7);
		System.out.println(d);
		int s = expansioncube(3,5);
		System.out.println(s);
		int p = expansionquad(2,3);
		System.out.println(p);
		int r = expansionpenta(2,7);
		System.out.println(r);
			}
	public static int expansion(int a,int b)
	{
		return a+b;
		}
	public static int expansionsquare(int a,int b)
	{
		return a*a+2*a*b+b*b;
	}
	public static int expansioncube(int a,int b)
	{
		return a*a*a+3*a*a*b+3*a*b*b+b*b*b;
	}
	public static int expansionquad(int a,int b)
	{
		return a*a*a*a+4*a*a*a*b+6*a*a*b*b+4*a*b*b*b+b*b*b*b;
	}
	public static int expansionpenta(int a,int b)
	{
		return a*a*a*a*a+5*a*a*a*a*b+10*a*a*a*b*b+10*a*a*b*b*b+5*a*b*b*b*b+b*b*b*b*b;
	}


}
