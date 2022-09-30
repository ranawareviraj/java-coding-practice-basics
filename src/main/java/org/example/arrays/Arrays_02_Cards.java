package org.example.arrays;

public class Arrays_02_Cards {
    public static void main(String[] args) {

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"\u2663", "\u2666", "\u2665", "\u2660"};
        String[] deck = new String[52];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[j + 13 * i] = rank[j] + suit[i];
                System.out.print(deck[j + 13 * i] + " ");
            }
            System.out.println();
        }
    }
}
/*
O/P:-
2♣ 3♣ 4♣ 5♣ 6♣ 7♣ 8♣ 9♣ 10♣ J♣ Q♣ K♣ A♣
2♦ 3♦ 4♦ 5♦ 6♦ 7♦ 8♦ 9♦ 10♦ J♦ Q♦ K♦ A♦
2♥ 3♥ 4♥ 5♥ 6♥ 7♥ 8♥ 9♥ 10♥ J♥ Q♥ K♥ A♥
2♠ 3♠ 4♠ 5♠ 6♠ 7♠ 8♠ 9♠ 10♠ J♠ Q♠ K♠ A♠
 */