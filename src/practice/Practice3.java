package practice;

import java.util.Random;
import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// differen ways to create an array
		// example 1: create an array of char type, has length of 5
		char[] charArray = new char[5];
		
		// example 2: create an array, and define it's content
		int[] intArray = new int[] {1, 3, 5, 7, 9};
		// print them out
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		System.out.println(intArray[4]);
		
		// String is just an wrapper of char array
		charArray[0] = 'A';
		charArray[1] = 'k';
		charArray[2] = 'i';
		charArray[3] = 'y';
		charArray[4] = 'o';
		
		// print this char array
		for(int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.print('\n');


		// we can also create array for objects
		Scanner[] scannerArray = new Scanner[3];
		// what happens here is, you have an array of 3 not yet initiailized Scanners. So they are all null
		scannerArray[0] = new Scanner(System.in);
		scannerArray[1] = new Scanner(System.in);
		scannerArray[2] = new Scanner(System.in);

		/*String a = scannerArray[0].nextLine();
		
		String b = scannerArray[1].nextLine();
		String c = scannerArray[2].nextLine();
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(a);*/

		/********************************************************/
		double[] doubleArray = new double[7];
		Random ran = new Random();
		ran.nextDouble();
		for (int j = 0; j < 7; j++) {
			doubleArray[j] = ran.nextDouble();
			System.out.println(doubleArray[j]);
		}
		double largest = -1.0;
		int largestIndex = -1;
		for (int i = 0; i < doubleArray.length; i++) {
			if (doubleArray[i] > largest) {
				largest = doubleArray[i];
				largestIndex = i;
			}
		
		}
		System.out.println("\n" + largest + "\n" + largestIndex);
		
		
		String name = "Isabelle";
		char[] nameArray = new char[name.length()];
		for (int i = 0; i < nameArray.length; i++) {
			nameArray[i] = name.charAt(i);
		}
		for(char c : nameArray) {
			System.out.print(c);
		}
		
		
		

	}

}
