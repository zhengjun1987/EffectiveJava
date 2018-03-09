package chapter10;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/9 9:46
 */
public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!stopRequested) {
                    i++;
                    System.out.println(MyUtils.getCurrentTime() + "i = " + i);
                }
            }
        });
        backgroundThread.start();
        Thread.sleep(1000);
        stopRequested = true;
        Thread.sleep(100);
        System.out.println(MyUtils.getCurrentTime() + "backgroundThread.isAlive() = " + backgroundThread.isAlive());
    }
}
