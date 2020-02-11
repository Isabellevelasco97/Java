package ice5;
	import java.util.Scanner;
public class Ice5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Please enter two strings: ");
		String str1 = cin.nextLine();
		String str2 = cin.nextLine();
		
		System.out.println("Please enter 2 numbers: ");
		int x = cin.nextInt();
		int y = cin.nextInt();
		
		String msg = "==============";
		msg += "\nThe first string is equal to the second one: " + str1.equals(str2) + "\n";
		msg += "The first number you entered is larger than the second one: " + (x > y) + "\n";
		
		System.out.print(msg);
		
		int sum = x + y;
		System.out.println(!str1.equals(str2) && sum > 80);
		System.out.println(sum < 20 || str1.length() < 80 );
		cin.close();
	}

}
