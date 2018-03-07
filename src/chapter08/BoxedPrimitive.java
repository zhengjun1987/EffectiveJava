package chapter08;

import chapter02.MyUtils;

import java.util.Comparator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/6 10:06
 */
public class BoxedPrimitive {
    public static void main(String[] args) {
        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(MyUtils.getCurrentTime() + "(o1-o2) = " + (o1 - o2));//(o1-o2) = 0
                System.out.println(MyUtils.getCurrentTime() + "o1.compareTo(o2) = " + o1.compareTo(o2));//o1.compareTo(o2) = 0
                return o1 < o2 ? -1
                        : (o1 == o2) ? 0 : 1;//o1 == o2对装箱类型使用==操作符基本上总是错误的
            }
        };
        System.out.println(MyUtils.getCurrentTime() + "integerComparator.compare(42,42) = " + integerComparator.compare(42, 42));//0
        System.out.println(MyUtils.getCurrentTime() + "integerComparator.compare(new Integer(42),new Integer(42)) = " + integerComparator.compare(new Integer(42), new Integer(42)));
    }
}
//2018-03-06 10:10:20:697  integerComparator.compare(new Integer(42),new Integer(42)) = 1