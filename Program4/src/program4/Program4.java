/*Charles Roberts
 * Program 4
 * 4/1/2012
 * 140-001
 */
package program4;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Program4 {
    
    public static void main(String[] args) {
    
    //Declare Variables
    int MinLower = 0, MaxLower = 999, MinUpper = 80, upperBound, lowerBound;
    //Declare Random Object as Instructed
    Random randomNum = new Random();
   //Declare Array
    int[] myArray = new int[2000]; 
    //Declare Scanner
    Scanner keyboard = new Scanner(System.in);   
    //Input error for Lower Bound    
    do{
            System.out.print("Enter the Lower bound (0.. 999): ");
            lowerBound=keyboard.nextInt();
        } while(lowerBound < MinLower || lowerBound > MaxLower);
    //Input error for Upper Bound
    do{
            System.out.print("Enter the Upper bound (80.. 999): ");
            upperBound=keyboard.nextInt();
        } while(upperBound < MinUpper || upperBound > MaxLower);
    //Assign Values to the Array
    for(int i = 0;i < 2000; i++)
    {
        myArray[i] = randomNum.nextInt(2001);
        //Return the Values that are between around Bounds Specified by user
        if(myArray[i] >= lowerBound && myArray[i] <= upperBound){
            System.out.printf("%d \n",myArray[i]);
            }
    }
    
        System.out.println("There are " + myArray.length + " Numbers in the Range " + lowerBound + " to " + upperBound);
        
       
          }
    
    
    
    
    }

