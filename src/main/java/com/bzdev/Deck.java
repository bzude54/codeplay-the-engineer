package com.bzdev;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Card deck class with overridden equals, hashcode, and toString methods and
 * methods to shuffled itself using different algorithms and data structures.
 * Methods to deal a hand of cards will be added in the future.
 *
 * @author Bill Zude
 * @version 10-14-15
 */
public class Deck {

    private Card[] cards = new Card[52];
    private int id = 1;

    public Deck() {
//        cards = new Card[52];
        initializeDeck();
    }

    /**
     * Method to build a standard card deck using the Suit and FaceValue Enum classes.
     */
    private void initializeDeck() {
        int index = 0;
        for (Suit suit : Suit.values()) {
            for (FaceValue faceValue : FaceValue.values()) {
                Card newcard = new Card(faceValue, suit);
                cards[index++] = newcard;
            }
        }
    }

    public void setCards(Card[] cards) {
        this.cards= cards;
    }


    public Card[] getCards() {
        return cards;
    }

    /**
     * Method to shuffle a deck of 52 playing cards by iterating through the array
     * representing the deck and swapping each card with another card in a random
     * location in the deck.
     *
     * @return shuffled deck
     */
    public Deck shuffleDeckArray() {
        Card[] cards = this.getCards();
        Random random = new Random();
        Card temp;
        int destindex;

        for (int sourceindex = cards.length - 1; sourceindex >= 0; sourceindex--) {
            temp = cards[sourceindex];
            destindex = random.nextInt(52);

            cards[sourceindex] = cards[destindex];
            cards[destindex] = temp;
        }

        return this;
    }


    /**
     * Method to shuffle a deck of 52 playing cards by converting the deck array to a list
     * of cards and iterating through the list and swapping each card with another card in a random
     * location in the deck. In this implementation, an explicit temporary location for the first card
     * being replaced is not required by using the methods available in the List collection.
     *
     * @return shuffled deck
     */
    public Deck shuffleDeckListIterative() {
        Random random = new Random();

        List<Card> cardList = Arrays.asList(this.getCards()).stream().collect(Collectors.toList());

        for (int index = cardList.size() - 1; index >= 0; index--) {

            cardList.set(index, cardList.set(random.nextInt(52), cardList.get(index)));
        }

        Card[] shuffledCards = cardList.toArray(new Card[52]);

        this.setCards(shuffledCards);

        return this;
    }


    /**
     * Method to shuffle a deck of 52 playing cards by converting the deck array to a list
     * of cards and swapping one randomly chosen card in the list with another randomly chosen
     * card in the list. Due to this bi-directional random selection, some cards may not be moved
     * while other cards may be swapped with themselves. In this implementation, an explicit temporary
     * location for the first card being replaced is not required by using the methods available
     * in the List collection.
     *
     * @return shuffled deck
     */
    public Deck shuffleDeckListRandom() {
        Random random = new Random();
        int index;

        List<Card> cardList = Arrays.asList(this.getCards()).stream().collect(Collectors.toList());

        for (int counter = cardList.size() - 1; counter >= 0; counter--) {
            index = random.nextInt(52);
            cardList.set(index, cardList.set(random.nextInt(52), cardList.get(index)));
        }

        Card[] shuffledCards = cardList.toArray(new Card[52]);

        this.setCards(shuffledCards);

        return this;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Deck)) return false;

        Deck deck = (Deck) o;
        Card[] deckCards = deck.getCards();

        boolean result = true;
        for (int i = 0; i < cards.length; i++) {
            if ( (!(cards[i].getSuit().equals(deckCards[i].getSuit()))) || (!(cards[i].getValue().equals(deckCards[i].getValue()))) ) {
                result = false;
            }
        }
        return result;

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cards);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (Card card : cards){
            sb.append(card.getValue());
            sb.append("-of-");
            sb.append(card.getSuit());
            sb.append(", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append(" }");
        return sb.toString();
    }
}
