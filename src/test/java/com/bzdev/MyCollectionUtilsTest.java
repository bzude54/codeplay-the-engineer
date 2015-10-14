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
 * Created by bzude on 10/9/15.
 */
public class MyCollectionUtilsTest {

    private MyCollectionUtils myCollectionUtil;
    private static final String INPUT_STRING_1 = "Does this damn thing work?";
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

        myCollectionUtil = new MyCollectionUtils();

    }


    @After
    public void tearDown() throws Exception {

    }

//    @Test
    public void testFindDistinctWords() throws Exception {

        int expectedIndex = 0;
        boolean matchWord = false;
        boolean matchAll = true;

        Set<String> distinctWords = myCollectionUtil.findDistinctWords(INPUT_STRING_1);

        assertTrue(distinctWords.containsAll(EXPECTED_DISTINCT_WORDS));

/*
        Iterator<String> stringIterator = distinctWords.iterator();
        for (int i = 1; i <= distinctWords.size() && stringIterator.hasNext(); i++) {
            System.out.println(stringIterator.next());
            System.out.println();
        }
*/

        for (String word : distinctWords) {
            System.out.println(word);
//            System.out.println();
        }

    }


//    @Test
    public void testFindDistinctWordsOrdered() throws Exception {

        int expectedIndex = 0;
        boolean matchWord = false;
        boolean matchAll = true;

        Set<String> distinctWordsOrdered = myCollectionUtil.findDistinctWordsOrdered(INPUT_STRING_1);

        assertTrue(distinctWordsOrdered.containsAll(EXPECTED_DISTINCT_WORDS));

        for (String word : distinctWordsOrdered) {
            System.out.println(word);
//            System.out.println();
        }

    }



    @Test
    public void testFindDistinctWordsAggregate() throws Exception {

        int expectedIndex = 0;
        boolean matchWord = false;
        boolean matchAll = true;

        Set<String> distinctWords = myCollectionUtil.findDistinctWordsAggregate(INPUT_STRING_1);

        for (String word : distinctWords) {
            System.out.println(word);
//            System.out.println();

            assertTrue(distinctWords.containsAll(EXPECTED_DISTINCT_WORDS));

/*
        Iterator<String> stringIterator = distinctWords.iterator();
        for (int i = 1; i <= distinctWords.size() && stringIterator.hasNext(); i++) {
            System.out.println(stringIterator.next());
            System.out.println();
        }
*/

        }

    }



//    @Test
    public void testFindPairs() throws Exception {

        Set<Pair> testPairs = myCollectionUtil.findPairs(INPUT_NUMBER_ARRAY_1, 2);

        for (Pair pair : testPairs) {
            System.out.println("pair: (" + pair.getFirst() + ", " + pair.getSecond() + ")");
            System.out.println();
        }



    }

}