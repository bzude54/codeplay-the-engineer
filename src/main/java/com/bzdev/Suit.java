package com.bzdev;

/**
 * Enum class for the four Suits in the card deck.
 *
 * @author Bill Zude
 * @version 10-14-15
 */
public enum Suit {
    DIAMOND("Diamonds"),
    HEART("Hearts"),
    SPADE("Spades"),
    CLUB("Clubs");


    private final String suit;

    Suit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return this.suit;
    }
}
