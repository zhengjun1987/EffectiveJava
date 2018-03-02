package chapter08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/2 17:53
 */
public class NestedForLoopErr {
    enum Suit {CLUB,DIAMOND,HEART,SPADE}
    enum Rank {ACE,DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING}

    public static void main(String[] args) {
        List<Suit> suits = Arrays.asList(Suit.values());
        List<Rank> ranks = Arrays.asList(Rank.values());
        ArrayList<Card> cards = new ArrayList<>();
        for (int i = 0; i < suits.size(); i++) {
            for (int j = 0; j < ranks.size(); j++) {
                cards.add(new Card(suits.get(i),ranks.get(j)));
            }
        }
    }
}
