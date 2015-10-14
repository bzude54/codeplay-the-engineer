package com.bzdev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Created by bzude on 10/7/15.
 */
public class MyArrayUtilsTest {

    private MyArrayUtils arrayUtil;

    private Deck originalDeck;

    private static final int[] myArray1 = {1, 2, 3, 4, 5, 6};

    private static final int[] myArray2 = {1, Integer.MAX_VALUE};

    private static final int[] myArray3 = {-1, Integer.MIN_VALUE};

    private static final int[] myArray4 = {Integer.MAX_VALUE, Integer.MIN_VALUE};

    private static final int[] myArray5 = {Integer.MAX_VALUE, 5, Integer.MIN_VALUE};

    private static final int[] myArray6 = {1, 2, 3, 4, 5, 6, 7};

    private static final char[] myArray7 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

    private static final int ARRAY1_EXPECTED = 21;
    private static final int ARRAY4_EXPECTED = -1;
    private static final int ARRAY5_EXPECTED = 4;
    private static final int ARRAY6_EXPECTED = 28;
    private static final int[] ARRAY6_REVERSE_EXPECTED = {7, 6, 5, 4, 3, 2, 1};
    private static final char[] ARRAY7_REVERSE_EXPECTED = {'g', 'f', 'e', 'd', 'c', 'b', 'a'};

    private static final int NUMBER_CARDS_IN_DECK = 52;

    @Before
    public void setUp() throws Exception {

        originalDeck = new Deck();

    }

    @After
    public void tearDown() throws Exception {

        originalDeck = null;

    }


    @Test
    public void testSumArray1() throws Exception {

        int result1 = MyArrayUtils.sum(myArray1);
        assertEquals(ARRAY1_EXPECTED, result1);
    }

    @Test (expected = IntegerWrapException.class)
    public void testSumArray2() throws Exception {

        int result2 = MyArrayUtils.sum(myArray2);
    }

    @Test (expected = IntegerWrapException.class)
    public void testSumArray3() throws Exception {

        int result3 = MyArrayUtils.sum(myArray3);

    }

    @Test
    public void testSumArray4() throws Exception {
        int result4 = MyArrayUtils.sum(myArray4);

        assertEquals(ARRAY4_EXPECTED, result4);
    }

    @Test
    public void testSumArray5() throws Exception {
        int result5 = MyArrayUtils.sum(myArray5);

        assertEquals(ARRAY5_EXPECTED, result5);
    }

    @Test
    public void testReverseArrayInt() throws Exception {
        int[] resultReverse = MyArrayUtils.reverseIt(myArray6);
        int result6 = MyArrayUtils.sum(resultReverse);

        System.out.println();
        System.out.println("input array is: "  + Arrays.toString(myArray6));
        System.out.println("output array is: " + Arrays.toString(resultReverse));
        System.out.println();

        assertEquals(ARRAY6_EXPECTED, result6);

        assertTrue(Arrays.equals(ARRAY6_REVERSE_EXPECTED, resultReverse));

    }


    @Test
    public void testReverseArrayChar() throws Exception {
        char[] resultReverse = MyArrayUtils.reverseIt(myArray7);

        System.out.println();
        System.out.println("input array is: "  + Arrays.toString(myArray7));
        System.out.println("output array is: " + Arrays.toString(resultReverse));
        System.out.println();

        assertTrue(Arrays.equals(ARRAY7_REVERSE_EXPECTED, resultReverse));
    }


/*
    @Test
    public void testShuffleDeckWithSet() {
//        Deck originalDeck = new Deck();
        Deck shuffledDeck = MyArrayUtils.shuffleDeckWithSet(originalDeck);
        System.out.println();
        System.out.println("Original deck: " + originalDeck.toString());
        System.out.println();
        System.out.println("Shuffled deck: " + shuffledDeck.toString());
        System.out.println();

        Set<Card> testUnique = new HashSet<>();
        for (Card card : shuffledDeck.getCards()) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
        assertFalse(originalDeck.equals(shuffledDeck));

    }
*/


/*
    @Test
    public void testShuffleDeckWithArray() {
        Deck originalDeck = new Deck();
        Deck shuffledDeck = MyArrayUtils.shuffleDeckWithArray(originalDeck);
        System.out.println();
        System.out.println("Original deck: " + originalDeck.toString());
        System.out.println();
        System.out.println("Shuffled deck: " + shuffledDeck.toString());
        System.out.println();

        Set<Card> testUnique = new HashSet<>();
        for (Card card : shuffledDeck.getCards()) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
        assertFalse(originalDeck.equals(shuffledDeck));

    }
*/

    @Test
    public void testDeckShuffle() {
        Deck origDeck = new Deck();
        Deck testDeck = new Deck();
        System.out.println();
        System.out.println("Original deck: " + origDeck.toString());
        System.out.println();

        Deck shuffledDeck = origDeck.shuffleDeckArray();
        System.out.println("Shuffled deck: " + shuffledDeck.toString());
        System.out.println();

        Set<Card> testUnique = new HashSet<>();
        for (Card card : shuffledDeck.getCards()) {
            testUnique.add(card);
        }
        assertEquals(NUMBER_CARDS_IN_DECK, testUnique.size());
        assertFalse(testDeck.equals(shuffledDeck));


    }


}