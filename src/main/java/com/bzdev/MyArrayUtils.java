package com.bzdev;


/**
 * Utilities to evaluate the input array to sum the values in the array and determine
 * if an integer overflow or underflow condition occurred. An overflow condition
 * generates a custom exception called IntegerWrapException which is throw up to the caller.
 * The last two utilities reverse the order of the elements in an input array so the elements
 * of the input array are reversed after the reverseIt method calls.
 *
 * @author Bill Zude
 * @version 10-14-15
 */
public class MyArrayUtils {


    /**
     * @param myArray
     * @return integer sum of the array elements if not overflow or underflow
     * @exception throws  custom IntegerWrapException if the sum of the array
     * overflows or underflows
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


    /**
     * Static method to reverse the elements in the input integer array.
     *
     * @param inputArray
     * @return void
     */
    public static void reverseIt(int[] inputArray) {

        int temp;
        int indexBack = inputArray.length - 1;
        int indexFront = 0;

        for (int j = 0; j <= inputArray.length/2; j++) {
            temp = inputArray[indexBack];
            inputArray[indexBack--] = inputArray[indexFront];
            inputArray[indexFront++] = temp;

        }
    }


    /**
     * Static method to reverse the elements in the input character array.
     *
     * @param inputArray
     * @return void
     */
    public static void reverseIt(char[] inputArray) {

        char temp;
        int indexBack = inputArray.length - 1;
        int indexFront = 0;

        for (int j = 0; j <= inputArray.length/2; j++) {
            temp = inputArray[indexBack];
            inputArray[indexBack--] = inputArray[indexFront];
            inputArray[indexFront++] = temp;

/*
            tmp = array[j];
            array[j] = array[array.length-j-1];
            array[array.length-j-1] = tmp;
*/
        }

    }

}
