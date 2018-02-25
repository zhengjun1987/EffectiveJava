package chapter05;

import java.util.Iterator;
import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/25 14:17
 */
public class GenericsGrammer {
    /* 此处的<T extends Comparable<T>> 就是Thinking In Java里面所说的"古怪语法"
    * 按EffectiveJava作者的表述,该句的意思是"针对可与自身进行大小比较的每个类型"
    * */
    public static <T extends Comparable<T>> T max(List<T> argTList) {
        Iterator<T> iterator = argTList.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (next.compareTo(result) > 0)
                result = next;
        }
        return result;
    }

    public static <T extends Comparable<T>> T maxWithWildCards(List<? extends T> argTList) {
        Iterator<? extends T> iterator = argTList.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (next.compareTo(result) > 0)
                result = next;
        }
        return result;
    }
}
