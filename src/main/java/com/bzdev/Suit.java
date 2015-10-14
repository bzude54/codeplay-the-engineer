package com.bzdev;

/**
 * Created by bzude on 10/13/15.
 */
public enum Suit {
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades"),
    CLUB("Clubs");


    private String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return this.suit;
    }
}
