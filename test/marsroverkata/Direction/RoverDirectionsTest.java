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
     * Test of moveLeft method, of class RoverDirections.
     */
    @Test
    public void testMoveLeft() {
        System.out.println("moveLeft");
        RoverDirections instance = new RoverDirectionsImpl();
        boolean expResult = false;
        boolean result = instance.moveLeft();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveRight method, of class RoverDirections.
     */
    @Test
    public void testMoveRight() {
        System.out.println("moveRight");
        RoverDirections instance = new RoverDirectionsImpl();
        boolean expResult = false;
        boolean result = instance.moveRight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveForeward method, of class RoverDirections.
     */
    @Test
    public void testMoveForeward() {
        System.out.println("moveForeward");
        RoverDirections instance = new RoverDirectionsImpl();
        boolean expResult = false;
        boolean result = instance.moveForeward();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of moveBackward method, of class RoverDirections.
     */
    @Test
    public void testMoveBackward() {
        System.out.println("moveBackward");
        RoverDirections instance = new RoverDirectionsImpl();
        boolean expResult = false;
        boolean result = instance.moveBackward();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RoverDirectionsImpl implements RoverDirections {

        public boolean moveLeft() {
            return false;
        }

        public boolean moveRight() {
            return false;
        }

        public boolean moveForeward() {
            return false;
        }

        public boolean moveBackward() {
            return false;
        }
    }
    
}
