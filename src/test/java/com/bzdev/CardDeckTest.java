package com.bzdev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by bzude on 10/13/15.
 */
public class CardDeckTest {

    private static final int NUMBER_CARDS_IN_DECK = 52;

    Deck origDeck;
    Deck testDeck;


    @Before
    public void setUp() throws Exception {
        origDeck = new Deck();
        testDeck = new Deck();

    }

    @After
    public void tearDown() throws Exception {

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
        for (Card card : testDeck.getCards()) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
        assertTrue(origDeck.equals(new Deck()));
        assertFalse(origDeck.equals(testDeck));
    }

    @Test
    public void testShuffleDeckList() throws Exception {

        System.out.println();
        System.out.println("Original deck: " + testDeck.toString());
        System.out.println();

        testDeck.shuffleDeckList();
        System.out.println("Shuffled deck: " + testDeck.toString());
        System.out.println();

        Set<Card> testUnique = new HashSet<>();
        for (Card card : testDeck.getCards()) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
        assertTrue(origDeck.equals(new Deck()));
        assertFalse(origDeck.equals(testDeck));
    }

}