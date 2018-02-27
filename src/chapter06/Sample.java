package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 11:29
 */
public class Sample {

    @Test
    public static void m1() {
        System.out.println("Sample.m1");
    }

    public static void m2() {
        System.out.println("Sample.m2");
    }

    @Test
    public static void m3() {
        System.out.println("Sample.m3");
        throw new RuntimeException("Boom!");
    }

    public static void m4() {
        System.out.println("Sample.m4");
    }

    @Test
    public void m5() {
        System.out.println("Sample.m5");
    }

    public static void m6() {
        System.out.println("Sample.m6");
    }

    @Test
    public static void m7() {
        System.out.println("Sample.m7");
        throw new RuntimeException("Crash!");
    }

    public static void m8() {
        System.out.println("Sample.m8");
    }
}
