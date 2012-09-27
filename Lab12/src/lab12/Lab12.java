/*Charles Roberts
 * 4/11/2012
 *Lab12
 *CS140-025
 */
package lab12;

import java.util.Scanner;

public class Lab12 {
	public static int ARRAY_SIZE = 26;
	
	public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		
		//Declare and instantiate the array to hold the letter counts
		int[] arr = new int[ARRAY_SIZE];
		String text;
		
		//Ask the user to enter the text
		System.out.println("Type some text and then press enter.");
		text = keyboard.nextLine();
		
		//Convert all letters to uppercase
		text = text.toUpperCase();
		
		parseLetters(arr, text);
		
		//Print the counts for each character
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.println((char)('A' + i) + ": " + arr[i]);
		}
	}
	
	//Given a string, this method will count the frequency of letters
	//A-Z and store them in the array.  The location corresponds with the
	//letter.  Example: array[0] contains count for 'A', array[25] holds
	//count for 'Z'.
    public static void parseLetters(int[] array, String text) {
		 for (int i = 0; i < text.length(); i++) {
                        int temp = text.charAt(i);
                       if (temp >= 'A' && temp <= 'Z') {
                           array[temp - 65]++; 
                     }
        }
	}
}

