package chapter02;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/18 9:41
 */
public class AutoboxingEffection {
    public static void main(String[] args) {
        System.out.println(MyUtils.getCurrentTime() + "AutoboxingEffection.开始执行");
        Long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum +=i;
        }
        System.out.println(MyUtils.getCurrentTime() + "sum = " + sum);
        System.out.println(MyUtils.getCurrentTime() + "AutoboxingEffection.完成执行");
        System.out.println(MyUtils.getCurrentTime() + "=================================================");
        System.out.println(MyUtils.getCurrentTime() + "AutoboxingEffection.开始执行");
        long sum2 = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum2 +=i;
        }
        System.out.println(MyUtils.getCurrentTime() + "sum2 = " + sum);
        System.out.println(MyUtils.getCurrentTime() + "AutoboxingEffection.完成执行");
    }
}
//        2018-01-18 09:45:19:164  AutoboxingEffection.开始执行
//        2018-01-18 09:45:29:769  sum = 2305843005992468481
//        2018-01-18 09:45:29:769  AutoboxingEffection.完成执行
//自动封箱的变量耗时10s605ms
//        2018-01-18 09:45:29:769  =================================================
//        2018-01-18 09:45:29:769  AutoboxingEffection.开始执行
//        2018-01-18 09:45:30:425  sum2 = 2305843005992468481
//        2018-01-18 09:45:30:425  AutoboxingEffection.完成执行
//基本类型耗时0s656ms
