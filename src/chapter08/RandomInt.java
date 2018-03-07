package chapter08;

import chapter02.MyUtils;

import java.util.Random;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/5 10:36
 */
public class RandomInt {
    private static Random random = new Random();

    static int random(int n) {
        return Math.abs(random.nextInt()) % n;
    }

    public static void main(String[] args) {
        int n = 2 * (Integer.MAX_VALUE / 3);
        int low = 0;
        for (int i = 1; i < 1000000; i++) {
            if (random(n) < n/2) {
                low++;
            }
        }
        System.out.println(MyUtils.getCurrentTime() + "low = " + low);
    }
//    2018-03-05 10:57:32:216  low = 666920
//    百万次运行中有66.7%的概率落在偏小的一方,违背了随机概率分布
//    Process finished with exit code 0
}
