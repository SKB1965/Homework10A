package edu.dmacc.codedsm.hw10A;

import java.util.LinkedList;

public class DeckofCards {

    public static LinkedList<String> deckofcards;

    public static void main(String[] args) {

        deckofcards = new LinkedList<>();

        LinkedList<String> suits = new LinkedList<>();
        suits.add("Clubs");
        suits.add("Hearts");
        suits.add("Diamonds");
        suits.add("Spades");


        LinkedList<Integer> ranks = new LinkedList<>();
        for (int i = 0; i < 13; i++) {
            ranks.add(i, i + 1);
        }
        // Fill deck
        fillingDeck(suits, ranks);

        // print deck
        for (String cards : deckofcards) {
            System.out.println(cards);
        }

    }

    public static void fillingDeck(LinkedList<String> suitsCards, LinkedList<Integer> cardsRanks) {
        int n = 0;
        for (int i = 0; i < suitsCards.size(); i++) {
            for (int j = 0; j < cardsRanks.size(); j++) {
                deckofcards.add(n++, suitsCards.get(i) + " - " + cardsRanks.get(j));
            }
        }

    }

}
