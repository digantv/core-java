package arraylist;

import java.util.ArrayList;

public class Intri {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		
		al.add("Digant");
		al.add("digantv");
		al.add("Test@123");
		al.add("Test@123");
		al.add("Admin");
		
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		System.out.println(al.get(2));
		System.out.println(al.get(3));
		System.out.println(al.get(4));
}
}