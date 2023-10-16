/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romannumeralstest;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.InputMismatchException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Benir_Osimbo_658477
 */

public class RomanNumeralTest {
    
  
    private RomanNumeral converter;
    
    @Before
    public void setUpClass() {
        converter = new RomanNumeral();  
       
               
        
        System.out.println("testRomanToInt");
    }
    
    @After
    public void tearDownClass() {
        
    }

    /**
     * Test of romanToInt method, of class RomanNumeral.
     */
    @Test
    public void singleDigit() {
        System.out.println("romanToInt Single Digit Test");
       
       //IVXLCDM
       assertEquals(1, converter.romanToInt("I"));
       assertEquals(5, converter.romanToInt("V"));
       assertEquals(10, converter.romanToInt("X"));
       assertEquals(50, converter.romanToInt("L"));
       assertEquals(100, converter.romanToInt("C"));
       assertEquals(500, converter.romanToInt("D"));
       assertEquals(1000, converter.romanToInt("M"));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /*Tetst if the romanToInt can convert repeating numereals*/
    @Test
    public void repetition(){
        System.out.println("romanToInt Repetition Test");
        
        assertEquals(2, converter.romanToInt("II"));
        assertEquals(3, converter.romanToInt("III"));
        assertEquals(20, converter.romanToInt("XX"));
        assertEquals(30, converter.romanToInt("XXX"));
        assertEquals(200, converter.romanToInt("CC"));
        assertEquals(300, converter.romanToInt("CCC"));
        assertEquals(2000, converter.romanToInt("MM"));
        assertEquals(3000, converter.romanToInt("MMM"));
    }
    /*Tetst if the romanToInt can convert subtracted numereals*/
    @Test
    public void subtractNumber(){
        System.out.println("romanToInt SN Test");
        
        assertEquals(4, converter.romanToInt("IV"));
        assertEquals(9, converter.romanToInt("IX"));
        assertEquals(40, converter.romanToInt("XL"));
        assertEquals(90, converter.romanToInt("XC"));
        assertEquals(400, converter.romanToInt("CD"));
        assertEquals(900, converter.romanToInt("CM"));
    }
    /*Test whether the program reads invalid letters*/
    @Test(expected = NullPointerException.class )
    public void invalidLetter(){
        System.out.println("romanToInt Invalid Letter");       
        assertNotNull(converter.romanToInt("Z"));  
    }
    
    /*Test to see whether romanToInr Processes invalid repetitions*/    
    
    @Test(expected = InputMismatchException.class)
    public void invalidRepetitions(){
        //String[] input =  {"VV","LL","DD"};      
      try{
          int val = 10;
          if(val==converter.romanToInt("VV"))
            fail("Expected exception was not thrown");
      }catch(Exception e){
          //assertTrue(true);
          throw new InputMismatchException("Can't repeat VV");
      }catch(AssertionError e){
          assertNotNull(converter.romanToInt("VV"));
      }
      
        
    }
    /*Test to check the maximum number of digits
    
    */
    @Test
    public void maxDigits(){
        assertEquals(false, converter.checkSize("MMMMMMMMMM"));
        assertEquals(false, converter.checkSize("XXXXXXXXXX"));
        assertEquals(true, converter.checkSize("MMMX"));
        assertEquals(true, "LLLLLLLLL");
    }
    
    
}
