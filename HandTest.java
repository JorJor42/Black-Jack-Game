/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jvend
 */
public class HandTest {
    
    public HandTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calcTotal method, of class Hand.
     */
    @Test
    public void testCalcTotal() {
        System.out.println("calcTotal");
        Hand instance = new Hand();
        int expResult = 0;
        int result = instance.calcTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInfo method, of class Hand.
     */
    @Test
    public void testGetInfo_0args() {
        System.out.println("getInfo");
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.getInfo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInfo method, of class Hand.
     */
    @Test
    public void testGetInfo_boolean_boolean() {
        System.out.println("getInfo");
        boolean isDealer = false;
        boolean holeCard = false;
        Hand instance = new Hand();
        String expResult = "";
        String result = instance.getInfo(isDealer, holeCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Hand.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        Hand instance = new Hand();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeHand method, of class Hand.
     */
    @Test
    public void testRemoveHand() {
        System.out.println("removeHand");
        Hand instance = new Hand();
        instance.removeHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
