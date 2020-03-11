package ice12;

import java.util.Random;

public class ICE12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Part 1 Iterating over an array with for loop
		
		// I.Create an array of integers of lenght 100 int[ ] nums = new int[100];
		// called nums II.Create a String variable called arrStr. We want to construct a
		// string that represents the array with this rule: If the number in the array
		// is a multiple of 7, the item will be replaced with the word "LUCKY" III.Use
		// the class Random and assign a random number to each empty cell in nums. Use a
		// for loop with upper limit of arr.length in your loop condition. IV.If the
		// array contains 10, 13, 21, 80 ... we want arrStr to be "[10, 13, LUCKY, 80
		// ...]" V.So you should first assign '[' to the arrStr variable, then loop
		// through the array and add each number to the string variable VI.IF the number
		// is a multiple of 7 arr[i] % 7 == 0 you should append "LUCKY" to arrStr
		
		int[] nums = new int[100];
		String arrStr = "[";
		Random rand = new Random();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rand.nextInt(100);
			if ((nums[i]%7)==0) {
				arrStr += " LUCKY ";
			} else {
				arrStr += (nums[i]);
			}
			arrStr += " , ";
		}
		System.out.print(arrStr + "\n");
		
		
		
		// I.Create an array of chars of length 200 II.Use a for loop and iterate over the array and use
		// the random object to create random numbers between 10 and 255. You can use
		// rand.nextInt(245) + 10 III.Cast the number into a char like this (char) (10 +
		// rand.nextInt(245)) and assign it to the cells inside the array IV.After the
		// loop is done, loop through the char array in a separate for loop and print
		// each character in the array with System.out.print()
		
		char[] chArray = new char[200];
		for (int i = 0; i < chArray.length; i++) {
			chArray[i] = (char) (10 + rand.nextInt(245));
			System.out.print(chArray[i]);
		}
		
	}
}
