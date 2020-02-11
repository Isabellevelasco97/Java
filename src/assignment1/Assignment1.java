package assignment1;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = scanner.nextLine();

		System.out.println("Hello, " + name + " Please enter the height of a right triangle: ");
		int height = -1;
		if (scanner.hasNextInt()) {
			height = scanner.nextInt();
		}
		else {
			System.out.println("Invalid value for height entered");
			System.exit(0);
		}
		if (height < 1 || height > 1000) {
			System.out.println("Invalid value for height entered");
			System.exit(0);
		}
		
		int base = -1;
		System.out.println("Now enter the base of the same right triangle: ");
		if (scanner.hasNextInt()) {
			base = scanner.nextInt();
		}
		else {
			System.out.println("Invalid value for base entered");
			System.exit(0);
		}
		if (base < 1 || base > 1000) {
			System.out.println("Invalid value for base entered");
			System.exit(0);
		}
		
		double areaOfTriangle = base * height * 0.5;
		System.out.println("The area of this triangle is : " + areaOfTriangle);
		
		System.out.println("Now enter the radius of a circle:");
		int radius = -1;
		if (scanner.hasNextInt()) {
			radius = scanner.nextInt();
		}
		else {
			System.out.println("Invalid value for radius entered");
			System.exit(0);
		}
		if (radius < 1 || radius > 1000) {
			System.out.println("Invalid value for radius entered");
			System.exit(0);
		}
		
		double areaOfCircle = Math.PI * radius * radius;
		System.out.println("The area of the circle is: " + areaOfCircle);
		
		double perimeter = 2 * Math.PI * radius;
		System.out.println("The perimeter of the circle is: " + perimeter);
		
		System.out.println("Can the triangle cover the circle?");
		
		
		//consume new line
		scanner.nextLine();
		String answer = scanner.nextLine();

		boolean isTriangleLarger = areaOfTriangle > areaOfCircle;
		if (answer.equals("yes")) {
			if (isTriangleLarger == true) {
				System.out.println("That's correct!");
			}
			else {
				System.out.println("That's wrong");
			}
		}
		else if (answer.equals("no")) {
			if (isTriangleLarger == false) {
				System.out.println("That's correct!");
			}
			else {
				System.out.println("That's wrong");
			}
		}
		else {
			System.out.println("That is wrong");
		}
		scanner.close();
	}
		
}
	


