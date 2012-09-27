/* Charles Roberts
 * 2/22/2012
 * CS140
 * Die.java (Lab6)
 */
package lab6;


public class Die {
    
    private int numberOfSides;
    
    public int getNumberofSides(){
        return numberOfSides;
    }

    public boolean setNumberOfSides(int newNumberOfSides){
        if(newNumberOfSides < 1){
            return false;
        }   
        else{
            numberOfSides = newNumberOfSides; 
            return true;
        }
    }

    public int rollDie(){
        return (int) (Math.random() * numberOfSides) + 1;
    }
}