package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/6 15:17
 */
public class Super {
    public Super() {
        System.out.println("Super.Super");
        overrideMe();
    }

    protected void overrideMe() {
        System.out.println("Super.overrideMe");
    }
}
