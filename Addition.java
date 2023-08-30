import java.util.Scanner;

public class Addition {
	// Addition Of Two Numbers by taking inputs.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Enter Second Number :");
		int b = sc.nextInt();
		sc.close();
		int c = a + b;
		System.out.println("Addition = " + c);

	}

}
