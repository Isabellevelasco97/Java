package lecture3;

public class Lecture3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result = 0.0;
		int x = 0, y = 0, z = 0;
		x = (4 * 5) + 3;
		// (4 * 5) + 3 == 23 and 4 * 5 + 3 == 23, same values
		// 3 + 4 * 5 == 23 while (3 + 4) * 5 == 35, different values
		y = (int) Math.sqrt(25);
		z = 32 % 11;
		
		String str = "the value of x is " + x 
				+"\nthe value of y is " + y
				+"\nthe value of z is " + z;
		System.out.println(str);
		/*
		the value of x is 23
		the value of y is 5
		the value of z is 10
		 */
		boolean isOdd;
		isOdd = (1 == y % 2);
		String strr = "y is an odd number : " + isOdd;
		System.out.println(strr);
		// y is an odd number : true
		x = x + 5;
		x += 5;
		System.out.println(x);
		// 33
		y = 5 * 5;
		result = ((double) x)/((double) y);
		String strrr = "The result of the division is " + result;
		System.out.println(strrr);
		// The result of the division is 1.32
		
	}

}
