package com.bzdev;

/**
 * Created by bzude on 10/11/15.
 */
public class Card {

    private Suit suit;
    private FaceValue faceValue;
    private int id;

    public Card() {}

    public Card(int id) {
        this.id = id;
    }

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

    public int getId() {
        return id;
    }

}
