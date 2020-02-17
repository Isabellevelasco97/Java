package ice9;
	import java.util.Scanner;
public class Ice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter a number between 0 and 100");
		

		while (true) {
			if (!cin.hasNextInt()) {
				// if user input a non number
				cin.next();
				System.out.println("I said enter a number between 0 and 100");
			} else {
				// if user input a number
				int x = cin.nextInt();
				if (x==-1) {
					break;
				}
				else if (x == 73) {
					System.out.println("Lucky guess!");
				}
				else if (x <= 0 || x >= 100) {
					System.out.println("The number is out of range");
				}
				System.out.println("Enter a number between 0 and 100");
			}
		}
		
		//adding a comment for commit
	}
}


		
	
		
		
	


