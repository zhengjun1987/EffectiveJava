package chapter05;

import chapter02.MyUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/24 15:35
 */
public class ElementsInCommon {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Alberta");
        strings.add("Berckley");
        strings.add("Cambridge");
        strings.add("Detroit");
        ArrayList<String> charsequences = new ArrayList<>();
        charsequences.add("Alberta");
        charsequences.add("Berckley");
        charsequences.add("Cambridge");
        charsequences.add("Donver");
        numElementsInCommon(strings,charsequences);
        System.out.println(MyUtils.getCurrentTime() + "charsequences.getClass().equals(strings.getClass()) = " + charsequences.getClass().equals(strings.getClass()));//true
    }

    private static void numElementsInCommon(List<?> argList1, List<?> argList2) {
        for (Object o : argList2) {
            if (argList1.contains(o)) {
                System.out.println(MyUtils.getCurrentTime() + "o = " + o);
            }
        }
    }
}
