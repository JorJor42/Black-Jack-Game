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
public class DealerTest {
    
    public DealerTest() {
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
     * Test of isBlackjack method, of class Dealer.
     */
    @Test
    public void testIsBlackjack() {
        System.out.println("isBlackjack");
        Dealer instance = new Dealer();
        boolean expResult = false;
        boolean result = instance.isBlackjack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealerPlay method, of class Dealer.
     */
    @Test
    public void testDealerPlay() {
        System.out.println("dealerPlay");
        Deck deck = null;
        Dealer instance = new Dealer();
        instance.dealerPlay(deck);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCard method, of class Dealer.
     */
    @Test
    public void testAddCard() {
        System.out.println("addCard");
        Card card = null;
        Dealer instance = new Dealer();
        instance.addCard(card);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHandString method, of class Dealer.
     */
    @Test
    public void testGetHandString() {
        System.out.println("getHandString");
        boolean isDealer = false;
        boolean holeCard = false;
        Dealer instance = new Dealer();
        String expResult = "";
        String result = instance.getHandString(isDealer, holeCard);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcTotal method, of class Dealer.
     */
    @Test
    public void testCalcTotal() {
        System.out.println("calcTotal");
        Dealer instance = new Dealer();
        int expResult = 0;
        int result = instance.calcTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeHand method, of class Dealer.
     */
    @Test
    public void testRemoveHand() {
        System.out.println("removeHand");
        Dealer instance = new Dealer();
        instance.removeHand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
