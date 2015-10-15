package com.bzdev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Tests for the card deck methods such as shuffling the deck
 * using different algorithms.
 *
 * @author Bill Zude
 * @version 10-14-15
 */
public class CardDeckTest {

    private static final int NUMBER_CARDS_IN_DECK = 52;

    private Deck origDeck;
    private Deck testDeck;


    @Before
    public void setUp() throws Exception {
        origDeck = new Deck();
        testDeck = new Deck();
    }

    @After
    public void tearDown() throws Exception {
        origDeck = null;
        testDeck = null;
    }

    @Test
    public void testShuffleDeckArray() throws Exception {

        System.out.println();
        System.out.println("Original deck: " + testDeck.toString());
        System.out.println();

        testDeck.shuffleDeckArray();
        System.out.println("Shuffled deck: " + testDeck.toString());
        System.out.println();

        Set<Card> testUnique = new HashSet<>();
        Card[] testDeckCards = testDeck.getCards();
        for (Card card : testDeckCards) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
//        assertTrue(origDeck.equals(new Deck()));
        assertFalse(origDeck.equals(testDeck));
    }

    @Test
    public void testShuffleDeckListIterative() throws Exception {

        System.out.println();
        System.out.println("Original deck: " + testDeck.toString());
        System.out.println();

        testDeck.shuffleDeckListIterative();
        System.out.println("Shuffled deck: " + testDeck.toString());
        System.out.println();

        Set<Card> testUnique = new HashSet<>();
        Card[] testDeckCards = testDeck.getCards();
        for (Card card : testDeckCards) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
        assertFalse(origDeck.equals(testDeck));
    }


    @Test
    public void testShuffleDeckListRandom() throws Exception {

        System.out.println();
        System.out.println("Original deck: " + testDeck.toString());
        System.out.println();

        testDeck.shuffleDeckListRandom();
        System.out.println("Shuffled deck: " + testDeck.toString());
        System.out.println();

        Set<Card> testUnique = new HashSet<>();
        Card[] testDeckCards = testDeck.getCards();
        for (Card card : testDeckCards) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
        assertFalse(origDeck.equals(testDeck));
    }

}