package chapter05;

import chapter02.MyUtils;

import java.util.ArrayList;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/24 12:00
 */
public class GenericsTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<CharSequence> charSequences = new ArrayList<>();
        System.out.println(MyUtils.getCurrentTime() + "strings.getClass() = " + strings.getClass());
        System.out.println(MyUtils.getCurrentTime() + "charSequences.getClass() = " + charSequences.getClass());
        unsafeAdd(strings,new Integer(2));
//        System.out.println(MyUtils.getCurrentTime() + "strings.get(0) = " + strings.get(0));//java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
        System.out.println(MyUtils.getCurrentTime() + "charSequences.getClass().equals(strings.getClass()) = " + charSequences.getClass().equals(strings.getClass()));//true

    }

    private static void unsafeAdd(ArrayList argArrayList, Object argO) {
        argArrayList.add(argO);
    }
}
//2018-02-24 12:02:07:845  strings.getClass() = class java.util.ArrayList
//2018-02-24 12:02:07:858  charSequences.getClass() = class java.util.ArrayList