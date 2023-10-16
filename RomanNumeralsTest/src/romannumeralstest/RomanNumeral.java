/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeralstest;
import java.util.*;
/**
 *
 * @author Benir_Osimbo_658477
 */
public class RomanNumeral {
    private static Map<Character, Integer> map;
    public RomanNumeral() {
        // TODO code application logic here
         map = new HashMap<Character, Integer>();
        
            map.put('I',1);
            map.put('V', 5);
            map.put('X', 10);
            map.put('L', 50);
            map.put('C', 100);
            map.put('D', 500);
            map.put('M', 1000);
    }
    public static int romanToInt(String s){

        int convertedNumber = 0;
        
        if(checkSize(s)==false)
                return 0;
    
        for(int i=0; i<s.length(); i++){
            int currentNumber = map.get(s.charAt(i));
            int next = i+ 1 < s.length()?
                map.get(s.charAt(i+1)):0;
    
            if(currentNumber >= next)
                convertedNumber += currentNumber;
            else
                convertedNumber -= currentNumber;
        }
        return convertedNumber;
    }
    public static boolean checkSize (String s){
        if (s.length() <=9 )
            return true;
        return false;
    }
}
