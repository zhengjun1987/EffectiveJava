package chapter04;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/1 11:00
 */
class AccessControlTest {
    public static void main(String[] args) {
        System.out.println(MyUtils.getCurrentTime() + "Constants.TAG = " + Constants.TAG);//2018-02-01 11:02:22:110  Constants.TAG = Constants
        //chapter04.AccessControlTest可以访问package-private的chapter04.Constants
        long start = System.nanoTime();
        for (int i = 128; i < 256; i++) {
            Integer.valueOf(i);
        }
        long end1 = System.nanoTime();
        for (int i = 0; i < 128; i++) {
            Integer.valueOf(i);
        }
        long end2 = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end1 - start) = " + (end1 - start));
        System.out.println(MyUtils.getCurrentTime() + "(end2 - end1) = " + (end2 - end1));
    }
}
