package com.bzdev;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

/**
 * This service class provides the methods to manipulate the input integer array.
 * So far, only a summation of the input array is provided.
 *
 * @author Bill Zude
 * @version 10-06-15
 */
public class MyArrayUtils {


    /**
     * @param myArray
     * @return
     */
    public static int sum(int[] myArray) throws IntegerWrapException {
        int intResult = 0;
        Long aLongResult = 0L;

        if ((myArray != null) && (myArray.length > 0)) {
            for (int element : myArray) {
                aLongResult += element;
            }

            if (aLongResult > Integer.MAX_VALUE) {
                throw new IntegerWrapException("The result has exceeded MAX_INT and integer wrapped!");
            } else if (aLongResult < Integer.MIN_VALUE) {
                throw new IntegerWrapException("The result has exceeded MIN_INT and integer wrapped!");
            } else {
                intResult = aLongResult.intValue();
            }
        }
        return intResult;
    }


    public static int[] reverseIt(int[] array) {

        int temp;
        int indexBack = array.length - 1;
        int indexFront = 0;
        int[] reverseArray = new int[array.length];
        int[] arrayCopy = array.clone();

        for (int j = 0; j <= arrayCopy.length/2; j++) {
            temp = arrayCopy[indexBack];
            arrayCopy[indexBack--] = array[indexFront];
            arrayCopy[indexFront++] = temp;

        }

        return arrayCopy;
    }



    public static char[] reverseIt(char[] array) {

        char temp;
        int indexBack = array.length - 1;
        int indexFront = 0;
        char[] reverseArray = new char[array.length];
        char[] arrayCopy = array.clone();

        for (int j = 0; j <= arrayCopy.length/2; j++) {
            temp = arrayCopy[indexBack];
            arrayCopy[indexBack--] = array[indexFront];
            arrayCopy[indexFront++] = temp;

/*
            reverseArray[indexBack] = array[indexFront];
            reverseArray[indexFront] = temp;
*/

/*
            tmp = array[j];
            array[j] = array[array.length-j-1];
            array[array.length-j-1] = tmp;
*/
        }

        return arrayCopy;
    }

}
