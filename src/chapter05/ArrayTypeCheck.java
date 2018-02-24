package chapter05;

import chapter02.MyUtils;

import java.util.Arrays;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/24 17:47
 */
public class ArrayTypeCheck {
    public static void main(String[] args) {
        Object[] arr = new Integer[10];
        arr[0] = 2.1f;//可以通过编译,但运行时会出错ArrayStoreException
        System.out.println(MyUtils.getCurrentTime() + "Arrays.toString(arr) = " + Arrays.toString(arr));//运行时类型检查
//        Exception in thread "main" java.lang.ArrayStoreException: java.lang.Float
//        at chapter05.ArrayTypeCheck.main(ArrayTypeCheck.java:15)
    }
}
