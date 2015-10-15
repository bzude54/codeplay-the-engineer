package com.bzdev;

/**
 * Card class used to make up a Deck of cards.
 *
 * @author Bill Zude
 * @version 10-14-15
 */
public class Card {

    private Suit suit;
    private FaceValue faceValue;

    public Card() {}

    public Card(FaceValue value, Suit suit) {
        this.suit = suit;
        this.faceValue = value;
    }

    public String getSuit() {
        return suit.getSuit();
    }

    public String getValue() {
        return faceValue.getFaceValue();
    }

}
