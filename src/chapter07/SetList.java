package chapter07;

import chapter02.MyUtils;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/1 10:24
 */
public class SetList {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = -3; i < 3; i++) {
            treeSet.add(i);
            arrayList.add(i);
        }
        System.out.println(MyUtils.getCurrentTime() + "treeSet = " + treeSet);
        System.out.println(MyUtils.getCurrentTime() + "arrayList = " + arrayList);
//        2018-03-01 10:54:25:645  treeSet = [-3, -2, -1, 0, 1, 2]
//        2018-03-01 10:54:25:646  arrayList = [-3, -2, -1, 0, 1, 2]
        for (int i = 0; i < 3; i++) {
            treeSet.remove(i);//TreeSet类仅有一个public boolean remove(Object o)
            arrayList.remove(i);//此句调用的是public E remove(int index)而非public boolean remove(Object o)
        }
        System.out.println(MyUtils.getCurrentTime() + "treeSet = " + treeSet);
        System.out.println(MyUtils.getCurrentTime() + "arrayList = " + arrayList);
    }
}
//        2018-03-01 10:49:37:524  treeSet = [-3, -2, -1]
//        2018-03-01 10:49:37:526  arrayList = [-2, 0, 2]
