/* Charles Roberts
 * Program 2
 * CS 140-001
 * 2-24-12
 */
package programtwo;

import javax.swing.JFrame;
import java.awt.*; 
import java.util.Locale;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;



public class ProgramTwo extends JFrame {
    
    private static final int FRAME_SIZE = 500;
    private static final int MAX_NUM = 40;
    private static final int MIN_NUM = 10;
    private static int lineNumber;
    
    
    public static void main(String[] args) {
       
       ProgramTwo guiWindow = new ProgramTwo (); 
       // Set the Frame Size
       guiWindow.setSize(FRAME_SIZE, FRAME_SIZE);
       guiWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);    
       String valueString;
    
    //Create input error trap to ask for Number of lines in the Grid
    do{  
    valueString = JOptionPane.showInputDialog("Enter The Number of Lines in the Grid (10-40)");
    guiWindow.lineNumber = Integer.parseInt(valueString);    
    } while(lineNumber < MIN_NUM || lineNumber > MAX_NUM);
    
    //Sets window as Visible
    guiWindow.setVisible(true);
    }
     @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics canvas = getContentPane().getGraphics();
        
        int width = this.getContentPane().getWidth();
        int height = this.getContentPane().getHeight();
       //X Coord top left
        double bottomBoarder = height*0.1;
        int yBottom = (int)bottomBoarder;
        //Y Coord top left
        double topBoarder = height*0.9;
        int yTop = (int)topBoarder;
        //X coord bottom left
        double leftBoarder = width*0.1;
        int xLeft = (int)leftBoarder;
        //Y coord bottom left
        double rightBoarder =  width*0.9;
        int xRight = (int)rightBoarder;
        //Draw the border
        canvas.drawLine(xLeft,yBottom,xLeft,yTop);
        canvas.drawLine(xRight,yBottom,xRight,yTop);
        canvas.drawLine(xLeft,yTop,xRight,yTop);
        canvas.drawLine(xLeft,yBottom,xRight,yBottom);
        
        
        
     
    }
}

