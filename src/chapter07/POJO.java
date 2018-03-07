package chapter07;

import chapter02.MyUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/28 14:20
 */
public class POJO {
    private Date mDate;

    public POJO(@NotNull Date argDate) {
        mDate = argDate;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(final Date argDate) {
//        argDate = new Date();
        mDate = argDate;
        argDate.setTime(555686);
//        mDate = new Date(argDate.getTime());
    }

    public static void main(String[] args) {
        POJO pojo = new POJO(new Date());
        Date date = new Date();
        pojo.setDate(date);
        System.out.println(MyUtils.getCurrentTime() + "pojo = " + pojo);

        date.setTime(985);
        System.out.println(MyUtils.getCurrentTime() + "pojo = " + pojo);
    }

    @Override
    public String toString() {
        return "POJO{" +
                "mDate=" + mDate +
                '}';
    }
}
