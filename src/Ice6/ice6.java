package Ice6;
	import java.util.Scanner;
public class ice6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		
		String userName = cin.nextLine();
		int lengthOfName = userName.length();
		if (lengthOfName < 5 || lengthOfName > 20) {
			System.out.println("User name should be between 5 characters and 20 characters long. The user name you entered is " + lengthOfName + " characters long");
			System.exit(1);
		}
		
		System.out.println("How old are you?");
		int age;
		if (cin.hasNextInt()) {
			age = cin.nextInt();
			if (age < 0 || age > 200) {
				System.out.println("The age you entered is out of range");
				System.exit(1);
			}
			else {
				int year = 2020 - age;
				System.out.println("You were born in: " + year);
				
			}
		}
		else {
			System.out.println("You must enter a whole number");
			System.exit(1);
		}
		cin.close();
		
		
		
		
		
	}

}
