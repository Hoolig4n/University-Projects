/* Charles Roberts
 * Program 1
 * CS 140-001
 * 2-10-12
 */
package programone;

import javax.swing.JFrame;
import java.awt.*; 
import java.util.Locale;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.lang.Math;

public class ProgramOne extends JFrame {
    
    private static final int FRAME_SIZE = 500;
    private int xCoordOne, xCoordTwo, radiusOne, radiusTwo, yCoordOne, yCoordTwo;
    
    
    public static void main(String[] args) {
    ProgramOne guiWindow = new ProgramOne ();
    // Set the Frame Size
    guiWindow.setSize(FRAME_SIZE, FRAME_SIZE);
    guiWindow.setDefaultCloseOperation(EXIT_ON_CLOSE);    
    String valueString;

    //Ask the user to enter the first x coord
    valueString = JOptionPane.showInputDialog("Enter the X-Coordinate of Circle 1");
    guiWindow.xCoordOne = Integer.parseInt(valueString);
    //Ask the user to enter the first y coord
    valueString = JOptionPane.showInputDialog("Enter the Y-Coordinate of Circle 1");
    guiWindow.yCoordOne = Integer.parseInt(valueString);
    //Ask the user to enter the second x coord
    valueString = JOptionPane.showInputDialog("Enter the X-Coordinate of Circle 2");
    guiWindow.xCoordTwo = Integer.parseInt(valueString);
    //Ask the user to enter the second y coord    
    valueString = JOptionPane.showInputDialog("Enter the Y-Coordinate of Circle 2");
    guiWindow.yCoordTwo = Integer.parseInt(valueString);
    //Ask the user to enter a desired radius
    valueString = JOptionPane.showInputDialog("Enter the Radius of Circle 1");
    guiWindow.radiusOne = Integer.parseInt(valueString);
    //Ask the user to enter a desired radius
    valueString = JOptionPane.showInputDialog("Enter the Radius of Circle 2");
    guiWindow.radiusTwo = Integer.parseInt(valueString);
    
    //Sets window as Visible
    guiWindow.setVisible(true);
    }
    
    @Override
    public void paint(Graphics canvas){
    
    double distance = Math.sqrt((((xCoordTwo + radiusTwo)-(xCoordOne + radiusOne))*((xCoordTwo + radiusTwo)-(xCoordOne + radiusOne)))+(((yCoordTwo + radiusTwo)-(yCoordOne + radiusOne))*((yCoordTwo + radiusTwo)-(yCoordOne + radiusOne)))); 
    double bothRadius = radiusOne + radiusTwo;
    double circle1Area = Math.PI * radiusOne * radiusOne;
    double circle2Area = Math.PI * radiusTwo * radiusTwo;
    double circle1Circ = 2 * Math.PI * radiusOne;
    double circle2Circ = 2 * Math.PI * radiusTwo;
        //Draw Oval 1
        canvas.drawOval(xCoordOne, yCoordOne, radiusOne * 2, radiusOne * 2);
        //Draw Oval 2
        canvas.drawOval(xCoordTwo, yCoordTwo, radiusTwo * 2, radiusTwo * 2);
        //Draw Line connecting 2 centers
        canvas.drawLine(xCoordOne + radiusOne,yCoordOne + radiusOne,xCoordTwo + radiusTwo,yCoordTwo + radiusTwo);
        //Circle 1 area information
        canvas.drawString("Circle 1's Area = " + String.format("%1.3f", circle1Area), 15, 50);
        //Circle 2 area information
        canvas.drawString("Circle 2's Area = " + String.format("%1.3f", circle2Area), 15, 65);
        //Circle 1 Circumference Info
        canvas.drawString("Circle 1's Circumference = " + String.format("%1.3f", circle1Circ), 175, 50);
        //Circle 2 Circumference Info
        canvas.drawString("Circle 2's Circumference = " + String.format("%1.3f", circle2Circ), 175, 65);
        // If Else to Determine if the circles Overlap
        if(distance>bothRadius){
           canvas.drawString("The Circles are Seperate!", 15, 80); 
        }
        else{
            canvas.drawString("The Circles Overlap!", 15, 80);
        }
    }
   
   
    }
