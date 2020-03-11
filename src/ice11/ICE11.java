package ice11;

import java.util.Random;

public class ICE11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// I.Create an array of type int with length 4 II.Create an array of type String
		// with length 4 III.By using the Random class, store a random number between 0
		// and 10 in each cell of the array IV.Go through the integer array items one by
		// one and check the value. If it is an odd number, put "ODD" in the
		// corresponding cell of the String array. If it is even, put "EVEN" V.For
		// instance if the first array contains 2,7,3,8 the String array should contain
		// "EVEN", "ODD", "ODD", "EVEN". VI.Use the print() statement and print out the
		// contents of the string array
		
		int[] intArray = new int[4];
		String[] strArray = new String[4];
		Random ran = new Random();
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = ran.nextInt(10);
			if (intArray[i] % 2 == 0) {
				strArray[i] = " even ";
			}	else {
					strArray[i] = " odd ";
				}
			System.out.print(intArray[i]);
			System.out.print(strArray[i]);
		}
		

	}
}

