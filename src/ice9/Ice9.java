package ice9;
	import java.util.Scanner;
public class Ice9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a program that keeps asking the user to enter a number between 1 and
		// 100. If the number that user enters is 73, your program should say "Lucky
		// Guess!", else keeps asking. The user should be able to break out of the loop
		// by entering -1. Your program should handle wrong inputs without crashing.
		Scanner cin = new Scanner(System.in);
		int x = 0;
		System.out.println("Enter a number between 0 and 100");
		
		while (!cin.hasNextInt()) {
			System.out.println("I said enter a number between 0 and 100");
			cin.next();
		}
		while (cin.hasNextInt()) {
			x = cin.nextInt();
			if (x == -1) {
				System.out.println("Play again");
				break;
			}
			if (x == 73) {
				System.out.println("Lucky guess!!");
			}
			else {
				System.out.println("Keep guessing~! Enter a number between 1 and 100");
			}
		}
		cin.close();
		
	}
}


		
	
		
		
	


