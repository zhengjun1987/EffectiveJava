package chapter06;

import chapter02.MyUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 16:32
 */
public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char argFirst, char argSecond) {
        first = argFirst;
        second = argSecond;
    }

//    @Override
    public boolean equals(Bigram obj) {
        return first==obj.first && second==obj.second;
    }

//    @Override
//    public boolean equals(Object argO) {
//        if (this == argO) return true;
//        if (argO == null || getClass() != argO.getClass()) return false;
//
//        Bigram bigram = (Bigram) argO;
//
//        if (first != bigram.first) return false;
//        return second == bigram.second;
//    }

    public int hashCode() {
        int result = (int) first;
        result = 31 * result + (int) second;
        return result;
    }

    public static void main(String[] args) {
        Set<Bigram> bigrams = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            for (char c = 'a'; c <= 'z'; c++) {
                bigrams.add(new Bigram(c,c));
            }
        }
        System.out.println(MyUtils.getCurrentTime() + "bigrams.size() = " + bigrams.size());
//        2018-02-27 16:39:03:274  bigrams.size() = 260
    }
}
