package com.bzdev;

/**
 * Class to create an object of the two elements in the pair of related
 * values generated in the findPairs method in the MyCollectionUtils class.
 *
 * @author Bill Zude
 * @version 10-06-15
 */
public class Pair {

    private int first;
    private int second;

    public Pair() {}

    public Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int getFirst(){
        return this.first;

    }

    public int getSecond() {
        return this.second;
    }

}
