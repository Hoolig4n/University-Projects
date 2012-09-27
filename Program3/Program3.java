/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program3;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Charles
 */
public class Program3 {

    static final String NAME1 = "Cougar";
    static final String SYMBOL1 = "SIUE";
    
    public static void main(String[] args) {
        
        Stock Stock1 = new Stock();
        Stock1.setName(NAME1);
        
        Stock Stock2 = new Stock();
        Stock2.setSymbol(SYMBOL1);
        
        System.out.println("Start The Race");
        
    }
}
