/* Charles Roberts
 * Lab 9
 * 3/21/2012
 * CS 140-025
 */
package lab9;

import java.util.HashSet;
import java.util.Set;


public class Lab9 {

    static final String NAME1 = "Green Frog";
    static final String NAME2 = "Blue Frog";
    
    public static void main(String[] args) {
        
        // Declare Frog1
        RacingFrog Frog1 = new RacingFrog();
        Frog1.setName(NAME1);
        
        // Declare Frog2
        RacingFrog Frog2 = new RacingFrog();
        Frog2.setName(NAME2);
        
        // Characteristics of Frog1
        Frog1.setJumpiness(0.5);
        Frog1.setMaxJumpDistance(10);
        Frog1.setMinJumpDistance(0);
        
        //Characteristics of Frog2
        Frog2.setJumpiness(0.5);
        Frog2.setMaxJumpDistance(10);
        Frog2.setMinJumpDistance(0);
       
        System.out.println("Start the Race!");
        
        int i = 1;
        while  (Frog1.getDistanceTravelled() < 30 && Frog2.getDistanceTravelled() < 30){
            System.out.println("Goad# " + i++);
            
            // Make the frogs jump
            Frog1.goad();
            Frog2.goad();
            
            //Print out the length of the jumps
            System.out.println(Frog1.getName() + " : " + Frog1.getDistanceTravelled());
            System.out.println(Frog2.getName() + " : " + Frog2.getDistanceTravelled());
      }
        
        if(Frog1.getDistanceTravelled() >= 30 && Frog2.getDistanceTravelled() >= 30){
            System.out.println("It was a tie");
        }
        //if else to print the name of the winner
        else if (Frog1.getDistanceTravelled() >= 30){
            System.out.println(Frog1.getName() + " is the Winner!");
        }
        else {
            System.out.println(Frog2.getName() + " is the Winner!");
        }
        
        }

    
}
