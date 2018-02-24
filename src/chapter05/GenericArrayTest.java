package chapter05;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/24 16:52
 */
public class GenericArrayTest {
    public static void main(String[] args) {
//        List<String>[] stringLists = new List<String>[1];错误:generic array creation
        List<?>[] lists = new List<?>[1];//此时又是合法的
    }
}
