package practice;
	import java.util.Scanner;
public class Practice {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//print the string backwards
	
		String cat = "Bean";
		for (int i = cat.length() -1; i > -1; i-- ) {
			System.out.print(cat.charAt(i));
		}
		// initializing variables
		Scanner scan = new Scanner(System.in);
		String person = new String("Isabelle");
		Integer age = new Integer(23);
		Boolean isLegal = null;
		
		// is person legal to drink based on age
		if (age > 20) {
			isLegal = true;
		}
		else {
			isLegal = false;
		}
		
		// inform user if person is legal or not
		if ( isLegal == true) {
			System.out.println(person + " is legal to drink because " + person + " is " + age);
		}
		else {
			System.out.println(person + "is not legal to drink because " + person + " is " + age);
		}
		
		String whatever = "Akiyo smells";
		/*
		for (int i = 0; i < whatever.length(); i+= 2) {
			System.out.println(whatever.charAt(i));
		}
		*/
		int i = 0;
		while ( i < whatever.length()) {
			System.out.println(whatever.charAt(i));
			i += 2;
		}
		System.out.println("enter a number");
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("enter a number");
		}
		
		
		
	}
}