package ice7;
	import java.util.Scanner;
public class Ice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		
		System.out.println("Please enter your full name");
		String name = cin.nextLine();
		
		System.out.println("Please enter your student ID");
		while (!cin.hasNextInt()) {
			System.out.println("Please enter an integer value");
			cin.next();
		}
		int studentId = cin.nextInt();
		int multiple = 0;
		
		while (studentId > 0) {
			studentId /= 5;
			multiple += 1;
		}
		
		System.out.println("Multiple is: " + multiple);
	}

}
