package chapter04;

import java.util.AbstractList;
import java.util.List;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/2/9 22:12
 * Project:EffectiveJava
 */
public class IntArrayAsList {
    static List<Integer> integerList(final int[] arr) {
        if (arr == null) {
            throw new NullPointerException();
        }
        return new AbstractList<Integer>() {
            @Override
            public Integer get(int index) {
                return arr[index];
            }

            @Override
            public int size() {
                return arr.length;
            }

            @Override
            public Integer set(int index, Integer element) {
                int oldVal = arr[index];
                arr[index] = element;
                return oldVal;
            }
        };
    }
}
