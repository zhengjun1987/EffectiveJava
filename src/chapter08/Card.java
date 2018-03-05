package chapter08;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/2 17:58
 */
public class Card {
    private final NestedForLoopErr.Suit mSuit;
    private final NestedForLoopErr.Rank mRank;

    public Card(NestedForLoopErr.Suit argSuit, NestedForLoopErr.Rank argRank) {
        mSuit = argSuit;
        mRank = argRank;
    }

    @Override
    public String toString() {
        return "Card{" +
                "mSuit=" + mSuit +
                ", mRank=" + mRank +
                '}';
    }
}
