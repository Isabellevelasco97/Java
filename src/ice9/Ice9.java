package ice9;
	import java.util.Scanner;
public class Ice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter a number between 0 and 100");
		
		while (!cin.hasNextInt()) {
			System.out.println("I said enter a number between 1 and 100");
			cin.next();
		}
		if (cin.hasNextInt()) {
			int x = cin.nextInt();
			if (x < 0 || x > 100) {
				System.out.println("That number is out of range");
			}
			/*if (x == -1) {
				break;
			}*/
		}
		
		}
		//adding a comment for commit
	}


		
	
		
		
	


