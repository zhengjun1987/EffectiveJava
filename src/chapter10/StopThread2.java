package chapter10;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/9 10:01
 */
public class StopThread2 {
    private static boolean stopRequested;

    public static synchronized boolean isStopRequested() {
        return stopRequested;
    }

    public static synchronized void setStopRequested(boolean argStopRequested) {
        stopRequested = argStopRequested;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while (!isStopRequested()) {
                    i++;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException argE) {
                        argE.printStackTrace();
                    }
                    System.out.println(MyUtils.getCurrentTime() + "i = " + i);
                }
            }
        });
        backgroundThread.start();
        Thread.sleep(1000);
        setStopRequested(true);
        System.out.println(MyUtils.getCurrentTime() + "backgroundThread.isAlive() = " + backgroundThread.isAlive());
        Thread.sleep(100);
        System.out.println(MyUtils.getCurrentTime() + "backgroundThread.isAlive() = " + backgroundThread.isAlive());
    }
}
//        2018-03-09 10:19:56:684  i = 1
//        2018-03-09 10:19:56:784  i = 2
//        2018-03-09 10:19:56:896  i = 3
//        2018-03-09 10:19:57:006  i = 4
//        2018-03-09 10:19:57:115  i = 5
//        2018-03-09 10:19:57:224  i = 6
//        2018-03-09 10:19:57:334  i = 7
//        2018-03-09 10:19:57:443  i = 8
//        2018-03-09 10:19:57:552  backgroundThread.isAlive() = true
//        2018-03-09 10:19:57:552  i = 9
//        2018-03-09 10:19:57:662  backgroundThread.isAlive() = false
