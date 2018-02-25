package chapter05;

import chapter02.MyUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/25 11:03
 */
public class Sets {
    private Sets() {
        throw new UnsupportedOperationException();
    }

    public static Set union(Set argSet1,Set argSet2){
        Set result = new HashSet(argSet1);
        result.addAll(argSet2);
        return result;
    }

    public static <T> Set<T> unionWithGenerics(Set<? extends T> argSet1,Set<? extends T> argSet2){
        HashSet<T> ts = new HashSet<>(argSet1);
        ts.addAll(argSet2);
        return ts;
    }

    public static void main(String[] args) {
        HashSet<String> guys = new HashSet<>(Arrays.asList("Tom", "Dick", "Harry"));
        HashSet<String> stooges = new HashSet<>(Arrays.asList("Larry", "Moe", "Curly"));
        Set<String> aflCio = unionWithGenerics(guys, stooges);
        System.out.println(MyUtils.getCurrentTime() + "aflCio = " + aflCio);
    }
}
//2018-02-25 11:12:11:439  aflCio = [Moe, Tom, Harry, Larry, Curly, Dick]
