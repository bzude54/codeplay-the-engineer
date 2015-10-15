package com.bzdev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import static org.junit.Assert.*;

/**
 * Tests for the MyCollectionUtils class
 *
 * @author Bill Zude
 * @version 10-14-15
 */
public class MyCollectionUtilsTest {

    private MyCollectionUtils myCollectionUtil;
    private static final String INPUT_STRING_1 = "Does    this damn    thing     work?";
    private Collection<String> EXPECTED_DISTINCT_WORDS = new LinkedList<>();

    private static final int[] INPUT_NUMBER_ARRAY_1 = {1, 7, 5, 9, 2, 12, 3};
    private Set<Pair> EXPECTED_PAIRS;

    @Before
    public void setUp() throws Exception {

        EXPECTED_DISTINCT_WORDS.add("Does");
        EXPECTED_DISTINCT_WORDS.add("this");
        EXPECTED_DISTINCT_WORDS.add("thing");
        EXPECTED_DISTINCT_WORDS.add("damn");
        EXPECTED_DISTINCT_WORDS.add("work?");

    }


    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFindDistinctWords() throws Exception {

        Set<String> distinctWords = MyCollectionUtils.findDistinctWords(INPUT_STRING_1);

        for (String word : distinctWords) {
            System.out.println(word);
        }

        assertTrue(distinctWords.containsAll(EXPECTED_DISTINCT_WORDS));
    }


    @Test
    public void testFindDistinctWordsOrdered() throws Exception {

        Set<String> distinctWordsOrdered = MyCollectionUtils.findDistinctWordsOrdered(INPUT_STRING_1);

        for (String word : distinctWordsOrdered) {
            System.out.println(word);
        }

        assertTrue(distinctWordsOrdered.containsAll(EXPECTED_DISTINCT_WORDS));
    }



    @Test
    public void testFindDistinctWordsAggregate() throws Exception {

        Set<String> distinctWords = MyCollectionUtils.findDistinctWordsAggregate(INPUT_STRING_1);

        for (String word : distinctWords) {
            System.out.println(word);
        }

        assertTrue(distinctWords.containsAll(EXPECTED_DISTINCT_WORDS));
    }



    @Test
    public void testFindPairs() throws Exception {

        Set<Pair> testPairs = MyCollectionUtils.findPairs(INPUT_NUMBER_ARRAY_1, 2);

        for (Pair pair : testPairs) {
            System.out.println("pair: (" + pair.getFirst() + ", " + pair.getSecond() + ")");
            System.out.println();
        }
    }
}