package ice4;
	import java.util.Scanner;
public class Lecture4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter your first name: ");
	if (!scan.hasNextLine()) {
		System.out.println("Please enter a real name");
	}
	String firstName = scan.nextLine();
	System.out.println("Please enter your last name: ");
	String lastName = scan.nextLine();
	System.out.println("Hello " + firstName);
	int year = 0, month = 0, day = 0;
	System.out.println("Please enter the year you were born in: ");
	year = scan.nextInt();
	System.out.println("Now enter the month you were born in: ");
	month = scan.nextInt();
	System.out.println("Finally, enter the day you were born in: ");
	day = scan.nextInt();
	System.out.println("Name \t\t  Date of birth \n=================================================\n" + firstName + " " + lastName + "\t\t" + day + "\\" + month + "\\" + year);
	scan.close();
	}

}
