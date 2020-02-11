package practice;
	import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check if a string is palindrome ex; tacocat
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a palindrome:");
		
		boolean palindrome = true;
		String str = "tacocat";
		int middleIndex = str.length()/2 ;
		for (int i = 0; i < middleIndex; i++) {
			if (str.charAt(middleIndex-i) != str.charAt(middleIndex+i)) {
				palindrome = false;
			}
		}
		System.out.println(palindrome);
			
		for(int i = 0; i < str.length(); i++) {
			
		}
	
		str += "s" + 1;
		System.out.println(str);
		
		
	}
}
