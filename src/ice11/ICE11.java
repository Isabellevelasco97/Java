package ice11;

import java.util.Random;

public class ICE11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArray = new int[4];
		String[] strArray = new String[4];
		Random ran = new Random();
		
		// Assigning random values to Intarray and checking if odd or even
		for (int i = 0; i < 4; i++) {
			intArray[i] = ran.nextInt(10);
			if ((intArray[i] % 2) == 0) {
				strArray[i] = "EVEN ";
			}
			else {
				strArray[i] = "ODD ";
			}
			
			System.out.print(intArray[i] + " " + strArray[i]);
		}
		

	}

}
