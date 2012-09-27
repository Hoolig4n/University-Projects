/* Charles Roberts
 * Program 2
 * CS 140-001
 * 2-24-12
 */
package program2;

import javax.swing.JFrame;
import java.awt.*; 
import java.util.Locale;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;



public class Program2 extends JFrame {
    
    private static final int FRAME_SIZE = 500;
    private static final int MAX_NUM = 40;
    private static final int MIN_NUM = 10;
    private static int lineNumber;
    
    
    public static void main(String[] args) {
       
       Program2 guiWindow = new Program2 (); 
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
       //Top of Grid
        double topOfGrid = height*0.1;
        int yTop = (int)topOfGrid;
        //Bottom of Grid
        double bottomOfGrid = height*0.9;
        int yBottom = (int)bottomOfGrid;
        //Left of Grid
        double leftOfGrid = width*0.1;
        int xLeft = (int)leftOfGrid;
        //Right of Grid
        double rightOfGrid =  width*0.9;
        int xRight = (int)rightOfGrid;
        //Draw the border
        //canvas.drawLine(xLeft,yTop,xLeft,yBottom);
        //canvas.drawLine(xRight,yTop,xRight,yBottom);
        //canvas.drawLine(xLeft,yBottom,xRight,yBottom);
        //canvas.drawLine(xLeft,yTop,xRight,yTop);
        //Variables for calculation
        int y = yTop;
        int x = xLeft;
        int numberOfGaps = lineNumber - 1;
        double spaceHori = ((width*.8)/(numberOfGaps));
        int spaceHorizontal = (int) spaceHori;
        double spaceVert = ((height*.8)/(numberOfGaps));
        int spaceVertical = (int) spaceVert;
        //Draw Vertical Lines
        for(int counter = 1; counter <= lineNumber; counter++){
            canvas.drawLine(xLeft,y,xRight,y);
            y = y + spaceVertical;
        }
        //Draw Horizontal Lines
         for(int counter = 1; counter <= lineNumber; counter++){
            canvas.drawLine(x,yTop,x,yBottom);
            x = x + spaceHorizontal;
        }
     
    }
}
