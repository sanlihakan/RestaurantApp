/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant_oo;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class SuperClass_Parent {
    
    public double Chicken;
    public double Meatball;
    public double Sandwich;
    public double Pasta;
    
    public double Cola;
    public double Fanta;
    public double Soda;
    public double Gazoz;
    
    public double Meals;
    public double Drinks;
    public double TotalOfMD;
    
    public double AllTotalOfMD;
    
    public double getAmount()
    {
        Meals = Chicken + Meatball + Sandwich + Pasta;
        Drinks = Cola + Fanta + Soda + Gazoz;
        TotalOfMD = Meals + Drinks;
        AllTotalOfMD = TotalOfMD;
        return AllTotalOfMD;
    }
    
    private JFrame frame;
    
    public void ExitSystem()
    {
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Restaurant System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }
    
    public double pChicken = 15;
    public double pMeatball = 10;
    public double pSandwich = 20;
    public double pPasta = 25;
    
    public double pCola = 2;
    public double pFanta =4;
    public double pSoda  = 4;
    public double pGazoz = 5;
    
    public double mcTax = 0.90;
    
    public double cFindTax(double cAmount)
    {
        double FindTax = cAmount - (cAmount*mcTax);
        return FindTax;
    }
}
