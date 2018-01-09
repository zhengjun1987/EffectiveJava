package chapter02;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/9 17:16
 */
public class HashMapStaticTest<K,V> extends HashMap<K,V> {

    public static final String DEF = "<def>";

    private HashMapStaticTest() {
    }

    public static <K,V> HashMapStaticTest<K,V> getInstance() {
        return new HashMapStaticTest<>();
    }

    public static void main(String[] args) {
        Map<String,Service> map = HashMapStaticTest.getInstance();
        map.put(DEF,Services.newInstance("<def>"));
        map.get(DEF).test();
    }
}
//        Exception in thread "main" java.lang.IllegalArgumentException: 该名称的Provider不存在
//        at chapter02.Services.newInstance(Services.java:31)
//        at chapter02.HashMapStaticTest.main(HashMapStaticTest.java:24)
//
//        Process finished with exit code 1
