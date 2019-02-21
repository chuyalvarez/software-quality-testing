/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JOSECARLOS
 */
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3; page ??
// See CalcTest.java, DataDrivenCalcTest.java for JUnit tests
public class Calc
{
   static public int add (int a, int b)
   {
      return a + b;
   }
   
   static public int subtract (int a, int b){
       return a - b;
   }
   
   static public double divide(int a, int b){
       if(b == 0){
           throw new IllegalArgumentException("Can't divide by zero");
       }
       return a / b;
   }
   
   static public int multiply (int a, int b){
       return a* b;
   }
}
