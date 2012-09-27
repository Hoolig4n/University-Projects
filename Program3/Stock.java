/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

/**
 *
 * @author Charles
 */
public class Stock {
   //Instance Variables 
   
   double currentStock, previousStock;
   String Symbol, Name;
    
   //Setters
   public void setName(String newName) {
       setEverything(this.currentStock, this.previousStock, this.Symbol, newName);
   }
   public void setSymbol(String newSymbol) {
       setEverything(this.currentStock, this.previousStock, newSymbol, this.Name);
   }

    public void setCurrentStock(double newCurrentStock) {
        setEverything(newCurrentStock, this.previousStock, this.Symbol, this.Name);
    }

    public void setPreviousStock(double newPreviousStock) {
        setEverything(this.currentStock, newPreviousStock, this.Symbol, this.Name);
    }
   
   //Getters
   public String getName() {
       return Name;
   }
   public String getSymbol() {
       return Symbol;
   }
   public double getCurrentStock() {
       return currentStock;
   } 
   public double getPreviousStock() {
       return previousStock;
   }
   //Designated Setter
    private void setEverything(double newCurrentStock, double newPreviousStock, String newName, String newSymbol) {
        if (newCurrentStock > 0.0) {
            currentStock = newCurrentStock;
        } 
        if (newPreviousStock > 0.0) {
            previousStock = newPreviousStock;
        }
        Name = newName;
        Symbol = newSymbol;
        
   //Constructors
   
    }
}
