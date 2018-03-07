package chapter08;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/6 10:36
 */
public class Unbelievable {
    static Integer sInteger;//sInteger初始值为null,而不是0;

    /**
     * 未初始化的包装类对象在自动拆箱时都会空指针异常
     * @author Zheng Jun
     */
    public static void main(String[] args) {
        if (sInteger < 42) {//Exception in thread "main" java.lang.NullPointerException at chapter08.Unbelievable.main(Unbelievable.java:13)
            System.out.println(MyUtils.getCurrentTime() + "Unbelievable!");
        }
    }
}
