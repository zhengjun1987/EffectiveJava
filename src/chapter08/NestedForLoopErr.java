package chapter08;

import chapter02.MyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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
        for(Iterator<Suit> iterator = suits.iterator();iterator.hasNext();){
            Suit suit = iterator.next();
            for(Iterator<Rank> rankIterator = ranks.iterator();rankIterator.hasNext();){
                cards.add(new Card(suit,rankIterator.next()));//外层循环的next只能调用一次,而这种写法调用了多次,极易出错
//                Exception in thread "main" java.util.NoSuchElementException
//                at java.util.AbstractList$Itr.next(AbstractList.java:364)
//                at chapter08.NestedForLoopErr.main(NestedForLoopErr.java:23)
//
//                Process finished with exit code 1
            }
        }
        System.out.println(MyUtils.getCurrentTime() + "cards = " + cards);
    }
}
//2018-03-05 09:35:25:158  cards = [Card{mSuit=CLUB, mRank=ACE}, Card{mSuit=CLUB, mRank=DEUCE}, Card{mSuit=CLUB, mRank=THREE}, Card{mSuit=CLUB, mRank=FOUR},
// Card{mSuit=CLUB, mRank=FIVE}, Card{mSuit=CLUB, mRank=SIX}, Card{mSuit=CLUB, mRank=SEVEN}, Card{mSuit=CLUB, mRank=EIGHT}, Card{mSuit=CLUB, mRank=NINE},
// Card{mSuit=CLUB, mRank=TEN}, Card{mSuit=CLUB, mRank=JACK}, Card{mSuit=CLUB, mRank=QUEEN}, Card{mSuit=CLUB, mRank=KING}, Card{mSuit=DIAMOND, mRank=ACE},
// Card{mSuit=DIAMOND, mRank=DEUCE}, Card{mSuit=DIAMOND, mRank=THREE}, Card{mSuit=DIAMOND, mRank=FOUR}, Card{mSuit=DIAMOND, mRank=FIVE}, Card{mSuit=DIAMOND, mRank=SIX},
// Card{mSuit=DIAMOND, mRank=SEVEN}, Card{mSuit=DIAMOND, mRank=EIGHT}, Card{mSuit=DIAMOND, mRank=NINE}, Card{mSuit=DIAMOND, mRank=TEN}, Card{mSuit=DIAMOND, mRank=JACK},
// Card{mSuit=DIAMOND, mRank=QUEEN}, Card{mSuit=DIAMOND, mRank=KING}, Card{mSuit=HEART, mRank=ACE}, Card{mSuit=HEART, mRank=DEUCE}, Card{mSuit=HEART, mRank=THREE},
// Card{mSuit=HEART, mRank=FOUR}, Card{mSuit=HEART, mRank=FIVE}, Card{mSuit=HEART, mRank=SIX}, Card{mSuit=HEART, mRank=SEVEN}, Card{mSuit=HEART, mRank=EIGHT},
// Card{mSuit=HEART, mRank=NINE}, Card{mSuit=HEART, mRank=TEN}, Card{mSuit=HEART, mRank=JACK}, Card{mSuit=HEART, mRank=QUEEN}, Card{mSuit=HEART, mRank=KING},
// Card{mSuit=SPADE, mRank=ACE}, Card{mSuit=SPADE, mRank=DEUCE}, Card{mSuit=SPADE, mRank=THREE}, Card{mSuit=SPADE, mRank=FOUR}, Card{mSuit=SPADE, mRank=FIVE},
// Card{mSuit=SPADE, mRank=SIX}, Card{mSuit=SPADE, mRank=SEVEN}, Card{mSuit=SPADE, mRank=EIGHT}, Card{mSuit=SPADE, mRank=NINE}, Card{mSuit=SPADE, mRank=TEN},
// Card{mSuit=SPADE, mRank=JACK}, Card{mSuit=SPADE, mRank=QUEEN}, Card{mSuit=SPADE, mRank=KING}]
