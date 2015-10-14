package com.bzdev;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by bzude on 10/11/15.
 */
public class Deck {

    private Card[] cards = new Card[52];
    private int id = 1;

    public Deck() {
//        cards = new Card[52];
        initializeDeck();
    }

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


    public Deck shuffleDeckArray() {
        Deck shuffledDeck = new Deck();

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


    public Deck shuffleDeckList() {
        Random random = new Random();

        List<Card> cardList = Arrays.asList(this.getCards()).stream().collect(Collectors.toList());

        for (int index = cardList.size() - 1; index >= 0; index--) {

            cardList.set(index, cardList.set(random.nextInt(52), cardList.get(index)));

        }


        Card[] shuffledCards = cardList.toArray(new Card[0]);

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
            sb.append(card.getValue() + "-of-" + card.getSuit() + ", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append(" }");
        return sb.toString();
    }
}
