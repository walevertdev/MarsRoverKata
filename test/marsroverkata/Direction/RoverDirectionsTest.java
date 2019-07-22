/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverkata.Direction;

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
public class RoverDirectionsTest {
    
    public RoverDirectionsTest() {
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
     * Test of getRoverDirection method, of class RoverDirections.
     */
    @Test
    public void testGetRoverDirection() {
        System.out.println("getRoverDirection");
        RoverDirections instance = new RoverDirections();
        char expResult = ' ';
        char result = instance.getRoverDirection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoverDirection method, of class RoverDirections.
     */
    @Test
    public void testSetRoverDirection() {
        System.out.println("setRoverDirection");
        char d = ' ';
        RoverDirections instance = new RoverDirections();
        instance.setRoverDirection(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
