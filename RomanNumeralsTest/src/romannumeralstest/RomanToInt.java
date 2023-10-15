/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeralstest;
import java.util.*;
import romannumeralstest.RomanNumeral;

/**
 *
 * @author Benir_Osimbo_658477
 */
public class RomanToInt {

    /**
     * @param args the command line arguments
     */
    //map that holds roman to integer
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        RomanNumeral converter;
        converter = new RomanNumeral();
        String romNum = "", ans="";
        
        while(ans.compareToIgnoreCase("y")!=0){
            System.out.println("Enter A Roman Numeral: ");        
            romNum = input.nextLine();
            
            int intNum = converter.romanToInt(romNum);
            System.out.println("The Roman number is "+intNum);
                        
            System.out.print("End? [Y/N]: ");        
            ans = input.nextLine();
            System.out.println();
        };
        
        
         
    }
    
    
}
