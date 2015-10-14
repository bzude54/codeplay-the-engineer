package com.bzdev;

import java.util.*;

import java.util.regex.*;
import java.util.stream.Collectors;

/**
 * Created by bzude on 10/9/15.
 */
public class MyCollectionUtils {

    Set<String> textSet;


    public Set<String> findDistinctWords(String words) {
        Set<String> distinctWords = new HashSet<>();

        String[] wordsArray = words.split("\\s|sep");

        for (String word : wordsArray) {
             distinctWords.add(word.toLowerCase());
            System.out.println("in find method: " + word);
        }

        return distinctWords;
    }


    public Set<String> findDistinctWordsOrdered(String words) {
        Set<String> distinctWordsOrdered = new TreeSet<>();

        String[] wordsArray = words.split("\\s|sep");

        for (String word : wordsArray) {
            distinctWordsOrdered.add(word.toLowerCase());
            System.out.println("in find and order method: " + word);

        }
        return distinctWordsOrdered;
    }


    public Set<String> findDistinctWordsAggregate(String words) {

        String[] wordsArray = words.split("\\s|sep");

        Set<String> distinctWords = Arrays.asList(wordsArray).stream()
                .collect(Collectors.toSet());
        System.out.println(distinctWords.size() +
                " distinct words: " +
                distinctWords);

        return distinctWords;
    }



    public Set<Pair> findPairs(int[] input, int diff) {
        Set<Pair> resultSet = new HashSet<>();
        int[] inputArray = input.clone();

        Arrays.sort(inputArray);

        int j = 1;

        for (int i = 0; i < inputArray.length - 1; i++) {
            j = i;
            while (inputArray[j] - inputArray[i] <= diff) {
                if (inputArray[j] - inputArray[i] == diff) {
                    Pair pair = new Pair(inputArray[i], inputArray[j]);
                    resultSet.add(pair);
                    System.out.println("in findpairs, first is: " + pair.getFirst() + ", second is: " + pair.getSecond());
                    break;
                } else {
                    ++j;
                }

            }
        }
        return resultSet;
    }




}
