// Lab6.java declares an object of class DieBasic and 
// tests it by running all of the class's methods.
package lab6;

import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
        Die myDie = new Die(); // declares a new DieBasic object called myDie.
        int numberOfRollsUserWants;
        Scanner keyboard = new Scanner(System.in);
        
        // first, set the numberOfSides for the DieBasic object.
        // (tests setNumberOfSides() method)
        do {
            System.out.print("How many sides would you like on your die? : ");
        }while (!myDie.setNumberOfSides(keyboard.nextInt()));
        
        // second, get how many times the user wants to roll the die.
        do {
            System.out.print("How many rolls do you want to see? (1..10): ");
            numberOfRollsUserWants = keyboard.nextInt();
        }while((numberOfRollsUserWants < 1) || (numberOfRollsUserWants > 10));
        
        // third, roll the die numberOfRollsUserWants times and print the results
        // (tests roll() method)
        for(int i = 1; i <= numberOfRollsUserWants; i++)
            System.out.println("Roll # " + i + ": " + myDie.rollDie());
    }
}

