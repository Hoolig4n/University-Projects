/*Charles Roberts
 * Lab 11
 * 140-025
 * 4/4/2012
 */
package lab11;

import java.util.Scanner;

public class Lab11 {

    
    public static void main(String[] args) {
        
        //Declare Variables
        int ARRAY_SIZE = 5, highestScore = 0;
        
        //Declare Array
        int[] grades = new int[ARRAY_SIZE];
        
        //Declare Scanner
        Scanner keyboard = new Scanner(System.in);
        
        //Prompt user to input 5 grades
        System.out.print("Enter 5 Scores:");
        
        //Get the 5 Scores
        for (int i = 0; i < ARRAY_SIZE;i++){
            grades[i] = keyboard.nextInt();
        }
        
        //Get the Highest Score
        for (int i = 0; i < ARRAY_SIZE; i++) {
            if (grades[i] > highestScore) {
                highestScore = grades[i];
            }
        }
        
        //Get the letter grades and print
        int diff;
        char letter;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            
            
            diff = highestScore - grades[i];
            
            if (diff<=10) {
                letter = 'A';
             }
            else if (diff<=20){
                letter = 'B';
            }
            else if (diff<=30){
                letter = 'C';
            }
            else if (diff<=40){
                letter = 'D';
            } else {
                letter = 'F';
            }
            System.out.println("Student " + i + " score is " + grades[i] + " and grade is " + letter);
        }
            
    }
}
