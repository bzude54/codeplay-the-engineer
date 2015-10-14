package com.bzdev;

/**
 * Created by bzude on 10/13/15.
 */
public enum FaceValue {

    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("10"),
    JACK("Jack"),
    QUEEN("Queen"),
    KING("King"),
    ACE("Ace");


    private String facevalue;

    FaceValue(String facevalue) {
        this.facevalue = facevalue;
    }

    public String getFaceValue() {
        return this.facevalue;
    }

}
