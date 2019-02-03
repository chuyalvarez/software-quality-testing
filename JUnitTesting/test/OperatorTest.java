/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JOSECARLOS
 */
public class OperatorTest {
    /**
     * Test of sum method, of class Operator.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int a = 2;
        int b = 3;
        Operator instance = new Operator();
        int result = instance.sum(a, b);
        assertEquals(result, 5);
    }

    /**
     * Test of multiplication method, of class Operator.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int a = 5;
        int b = 3;
        Operator instance = new Operator();
        int result = instance.multiplication(a, b);
        assertEquals(result, 15);
    }

    /**
     * Test of helloWorld method, of class Operator.
     */
    @Test
    public void testHelloWorld() {
        System.out.println("helloWorld");
        Operator instance = new Operator();
        String result = instance.helloWorld();
        assertEquals(result, "Hello World");
    }
}
