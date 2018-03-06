package chapter08;

import chapter02.MyUtils;

import java.util.Arrays;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/6 17:06
 */
public class ReflectiveInstantiation {
    /**
     * @author Zheng Jun
     * @throws ClassNotFoundException k
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cl;
        cl = Class.forName("java.util.TreeSet");
        Set<String> strings = null;
        try {
            strings = (Set<String>) cl.newInstance();
        } catch (InstantiationException argE) {
            argE.printStackTrace();
        } catch (IllegalAccessException argE) {
            argE.printStackTrace();
        }

        args = "java.util.TreeSet".split("\\.");
        System.out.println(MyUtils.getCurrentTime() + "Arrays.toString(args) = " + Arrays.toString(args));

        strings.addAll(Arrays.asList(args));
        System.out.println("strings = " + strings);
    }
}
//2018-03-06 17:32:16:245  Arrays.toString(args) = [java, util, TreeSet]
//        strings = [TreeSet, java, util]
//
//        Process finished with exit code 0
