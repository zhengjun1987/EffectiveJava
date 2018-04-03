package chapter10;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/9 15:11
 */
public class StopThread3 {
    private static volatile boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException argE) {
                        argE.printStackTrace();
                    }
                    System.out.println(MyUtils.getCurrentTime() + "i = " + i);
                }
            }
        });
        backgroundThread.start();
        Thread.sleep(1000);
        stopRequested = true;
        System.out.println(MyUtils.getCurrentTime() + "backgroundThread.isAlive() = " + backgroundThread.isAlive());
        Thread.sleep(10);
        System.out.println(MyUtils.getCurrentTime() + "backgroundThread.isAlive() = " + backgroundThread.isAlive());
    }
}
//        2018-03-09 15:12:59:692  i = 1
//        2018-03-09 15:12:59:792  i = 2
//        2018-03-09 15:12:59:892  i = 3
//        2018-03-09 15:12:59:992  i = 4
//        2018-03-09 15:13:00:092  i = 5
//        2018-03-09 15:13:00:192  i = 6
//        2018-03-09 15:13:00:293  i = 7
//        2018-03-09 15:13:00:393  i = 8
//        2018-03-09 15:13:00:493  i = 9
//        2018-03-09 15:13:00:565  backgroundThread.isAlive() = true
//        2018-03-09 15:13:00:595  i = 10
//        2018-03-09 15:13:00:666  backgroundThread.isAlive() = false
