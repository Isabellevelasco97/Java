package ice12;

import java.util.Random;

public class ICE12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part 1 Iterating over an array with for loop
		int[] nums = new int[100];
		String arrStr = "[";
		Random ran = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ran.nextInt(100);
			if ((nums[i]%7)==0) {
				arrStr += "LUCKY";
			}
			else {
				
				arrStr += (nums[i]);
			}
			arrStr += ", ";
		}
		System.out.println(arrStr + "]");
		//[64, LUCKY, LUCKY, 27, 66, 6, LUCKY, 95, 75, 76, 94, 4, 30, 22, 87, 47, 3, 11, 90, 25, 27, 79, LUCKY, LUCKY, 24, LUCKY, LUCKY, 2, 68, 6, 26, 96, 85, 34, 55, 22, 73, 92, LUCKY, 89, 83, 20, 6, LUCKY, 62, 53, 76, 81, 27, 45, 16, 22, 90, 4, 39, 26, 15, 64, 92, 85, 25, 38, 87, 54, 72, 27, 76, LUCKY, 33, 34, 24, LUCKY, LUCKY, 66, 96, 17, 25, 3, 46, 20, 33, 43, 17, 78, 17, 83, 20, 51, 78, 36, 51, 59, 51, 48, 65, LUCKY, 36, 18, 52, 8, ]

		// Part 2 Random Characters
		char[] arrChar = new char[200];
		for (int i = 0; i < arrChar.length; i++) {
			arrChar [i] = (char)(ran.nextInt(245)+10);
			System.out.print(arrChar[i]);
		}
		
	}

}
