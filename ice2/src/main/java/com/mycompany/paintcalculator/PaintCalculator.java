/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paintcalculator;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class PaintCalculator {

    public static void main(String[] args) {
        
int rLength = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the length of the room")); 
int rHeight =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the height of the room"));
int rWidth =Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the width of the room"));

     roomArea(  rLength, rHeight, rWidth);
     
       //JOptionPane.showMessageDialog(null, "the cost to paint a " + rLength +" by " + rWidth + " foot room with" + rHeight + " foot ceilings is $" + paintCost);
     
       }
    public static void roomArea(int rHeight, int rLength, int rWidth){
        
       int Area = ((rLength * rHeight + rHeight * rWidth)*2);
       JOptionPane.showMessageDialog(null,"The area of the room is "+Area+ "sq.ft.");
       gallonNum( Area);
      
     
       
    }
    public static void gallonNum(int Area ){
        if (Area <= 350){
            JOptionPane.showMessageDialog(null,"You need 1 gallon of paint");
            int gallon = 1;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
           
        }
        if (Area > 350 && Area <=700){
            JOptionPane.showMessageDialog(null,"You need 2 gallons of paint");
            int gallon = 2;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
            
        }
         if (Area > 700 && Area <=1050){
            JOptionPane.showMessageDialog(null,"You need 3 gallons of paint");
            int gallon = 3;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
            
        }
          if (Area > 1050 && Area <=1400){
            JOptionPane.showMessageDialog(null,"You need 4 gallons of paint");
            int gallon = 4;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
            
        }
           if (Area > 1400 && Area <=1750){
            JOptionPane.showMessageDialog(null,"You need 5 gallons of paint");
            int gallon = 5;
             int  paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
            
        }
            if (Area > 1750 && Area <=2100){
            JOptionPane.showMessageDialog(null,"You need 6 gallons of paint");
            int gallon = 6;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
            
        }
             if (Area > 2100 && Area <=2450){
            JOptionPane.showMessageDialog(null,"You need 7 gallons of paint");
            int gallon = 7;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
            
        }
              if (Area > 2450 && Area <=2800){
            JOptionPane.showMessageDialog(null,"You need 8 gallons of paint");
            int gallon = 8;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
            
        }
               if (Area > 3150 && Area <=3500){
            JOptionPane.showMessageDialog(null,"You need 9 gallons of paint");
            int gallon = 9;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
             
        }
                if (Area > 3500 && Area <=3850){
            JOptionPane.showMessageDialog(null,"You need 10 gallons of paint");
            int gallon = 10;
            int   paintCost = gallon * 32 ;
             JOptionPane.showMessageDialog(null,"To paint your room will cost $" + paintCost);
             
        }
              
    }
}
