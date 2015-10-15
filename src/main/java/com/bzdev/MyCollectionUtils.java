package com.bzdev;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Collections utilities such as methods to find the distinct words in an
 * input word string using spaces between words. The findPairs method finds
 * the number pairs within the input integer array input as the first parameter
 * with the integer difference between the integers in the pair input as
 * the second parameter to the method.
 *
 * @author Bill Zude
 * @version 10-14-15
 *
 */
public class MyCollectionUtils {

    Set<String> textSet;


    public static Set<String> findDistinctWords(String words) {
        Set<String> distinctWords = new HashSet<>();

        String[] wordsArray = words.split("\\s+");

        for (String word : wordsArray) {
             distinctWords.add(word);
//            System.out.println("in find method: " + word);
        }
        return distinctWords;
    }


    public static Set<String> findDistinctWordsOrdered(String words) {
        Set<String> distinctWordsOrdered = new TreeSet<>();

        String[] wordsArray = words.split("\\s+");

        for (String word : wordsArray) {
            distinctWordsOrdered.add(word);
 //           System.out.println("in find and order method: " + word);
        }
        return distinctWordsOrdered;
    }


    public static Set<String> findDistinctWordsAggregate(String words) {

        String[] wordsArray = words.split("\\s+");

        Set<String> distinctWords = Arrays.asList(wordsArray).stream()
                .collect(Collectors.toSet());
        System.out.println(distinctWords.size() +
                " distinct words: " +
                distinctWords);

        return distinctWords;
    }



    public static Set<Pair> findPairs(int[] inputArray, int diff) {
        Set<Pair> resultSet = new HashSet<>();

        Arrays.sort(inputArray);

        int j = 0;

        for (int i = 0; i < inputArray.length - 1; i++) {
            j = i;
            while (inputArray[j] - inputArray[i] <= diff) {
                if (inputArray[j] - inputArray[i] == diff) {
                    Pair pair = new Pair(inputArray[i], inputArray[j]);
                    resultSet.add(pair);
 //                   System.out.println("in findpairs, first is: " + pair.getFirst() + ", second is: " + pair.getSecond());
                    break;
                } else {
                    ++j;
                }

            }
        }
        return resultSet;
    }
}
