package ice8;
	import java.util.Scanner;
public class Ice8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		System.out.println("Please enter your email address:");
		String email = cin.nextLine();
		boolean containsSingleAtSign = false;
		boolean containsDot = false;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i)=='@') {
				containsSingleAtSign = !containsSingleAtSign;
			}
			if (email.charAt(i)=='.') {
				containsDot = true;
			}
		}
		

		if (containsSingleAtSign && containsDot) {
			System.out.println("This is a valid email address");
		}
		else { 
			System.out.println("This is not a valid email address");
		}
		cin.close();
	}
	
}
