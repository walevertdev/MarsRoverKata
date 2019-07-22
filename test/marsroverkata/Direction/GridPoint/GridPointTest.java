/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsroverkata.Direction.GridPoint;

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
public class GridPointTest {
    
    public GridPointTest() {
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
     * Test of getXPoint method, of class GridPoint.
     */
    @Test
    public void testGetXPoint() {
        System.out.println("getXPoint");
        GridPoint instance = new GridPoint();
        int expResult = 0;
        int result = instance.getXPoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYPoint method, of class GridPoint.
     */
    @Test
    public void testGetYPoint() {
        System.out.println("getYPoint");
        GridPoint instance = new GridPoint();
        int expResult = 0;
        int result = instance.getYPoint();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXPoint method, of class GridPoint.
     */
    @Test
    public void testSetXPoint() {
        System.out.println("setXPoint");
        int x = 0;
        GridPoint instance = new GridPoint();
        instance.setXPoint(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYPoint method, of class GridPoint.
     */
    @Test
    public void testSetYPoint() {
        System.out.println("setYPoint");
        int y = 0;
        GridPoint instance = new GridPoint();
        instance.setYPoint(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
