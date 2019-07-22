/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverkata;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author walevert
 */
public class MarsRoverKataTest {
    
    public MarsRoverKataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class MarsRoverKata.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MarsRoverKata.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoverDirection method, of class MarsRoverKata.
     */
    @Test
    public void testGetRoverDirection() {
        System.out.println("getRoverDirection");
        MarsRoverKata instance = new MarsRoverKata();
        char expResult = ' ';
        char result = instance.getRoverDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoverDirection method, of class MarsRoverKata.
     */
    @Test
    public void testSetRoverDirection() {
        System.out.println("setRoverDirection");
        char d = ' ';
        MarsRoverKata instance = new MarsRoverKata();
        instance.setRoverDirection(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveLeft method, of class MarsRoverKata.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("moveLeft");
        MarsRoverKata instance = new MarsRoverKata();
        boolean expResult = false;
        boolean result = instance.moveLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveRight method, of class MarsRoverKata.
     */
    @Test
    public void testMoveRight() {
        System.out.println("moveRight");
        MarsRoverKata instance = new MarsRoverKata();
        boolean expResult = false;
        boolean result = instance.moveRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveForeward method, of class MarsRoverKata.
     */
    @Test
    public void testMoveForeward() {
        System.out.println("moveForeward");
        MarsRoverKata instance = new MarsRoverKata();
        boolean expResult = false;
        boolean result = instance.moveForeward();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBackward method, of class MarsRoverKata.
     */
    @Test
    public void testMoveBackward() {
        System.out.println("moveBackward");
        MarsRoverKata instance = new MarsRoverKata();
        boolean expResult = false;
        boolean result = instance.moveBackward();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
