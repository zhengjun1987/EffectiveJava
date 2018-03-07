package chapter04;

import chapter02.MyUtils;

import java.util.Date;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/6 15:19
 */
public final class Sub extends Super {

    private final Date mDate;//注意mDate的final修饰符

    public Sub() {
        mDate = new Date();
    }

    @Override
    protected void overrideMe() {
        System.out.println(MyUtils.getCurrentTime() + "mDate = " + mDate);//若此处调用了mDate的某个方法,在初始化时候会空指针异常
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
//2018-02-06 15:22:37:271  mDate = null
//2018-02-06 15:22:37:271  mDate = Tue Feb 06 15:22:37 CST 2018
//final域mDate的两种状态
