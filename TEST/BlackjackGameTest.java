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
public class BlackjackGameTest {
    
    public BlackjackGameTest() {
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
     * Test of gameStart method, of class BlackjackGame.
     */
    @Test
    public void testGameStart() {
        System.out.println("gameStart");
        BlackjackGame instance = new BlackjackGame();
        instance.gameStart();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printRules method, of class BlackjackGame.
     */
    @Test
    public void testPrintRules() {
        System.out.println("printRules");
        BlackjackGame instance = new BlackjackGame();
        instance.printRules();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffle method, of class BlackjackGame.
     */
    @Test
    public void testShuffle() {
        System.out.println("shuffle");
        BlackjackGame instance = new BlackjackGame();
        instance.shuffle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealCards method, of class BlackjackGame.
     */
    @Test
    public void testDealCards() {
        System.out.println("dealCards");
        BlackjackGame instance = new BlackjackGame();
        instance.dealCards();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBlackjack method, of class BlackjackGame.
     */
    @Test
    public void testCheckBlackjack() {
        System.out.println("checkBlackjack");
        BlackjackGame instance = new BlackjackGame();
        instance.checkBlackjack();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hitStand method, of class BlackjackGame.
     */
    @Test
    public void testHitStand() {
        System.out.println("hitStand");
        BlackjackGame instance = new BlackjackGame();
        instance.hitStand();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dealersTurn method, of class BlackjackGame.
     */
    @Test
    public void testDealersTurn() {
        System.out.println("dealersTurn");
        BlackjackGame instance = new BlackjackGame();
        instance.dealersTurn();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkOutcome method, of class BlackjackGame.
     */
    @Test
    public void testCheckOutcome() {
        System.out.println("checkOutcome");
        BlackjackGame instance = new BlackjackGame();
        instance.checkOutcome();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printStatus method, of class BlackjackGame.
     */
    @Test
    public void testPrintStatus() {
        System.out.println("printStatus");
        BlackjackGame instance = new BlackjackGame();
        instance.printStatus();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeHands method, of class BlackjackGame.
     */
    @Test
    public void testRemoveHands() {
        System.out.println("removeHands");
        BlackjackGame instance = new BlackjackGame();
        instance.removeHands();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of playAgain method, of class BlackjackGame.
     */
    @Test
    public void testPlayAgain() {
        System.out.println("playAgain");
        BlackjackGame instance = new BlackjackGame();
        boolean expResult = false;
        boolean result = instance.playAgain();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gameEnd method, of class BlackjackGame.
     */
    @Test
    public void testGameEnd() {
        System.out.println("gameEnd");
        BlackjackGame instance = new BlackjackGame();
        instance.gameEnd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
