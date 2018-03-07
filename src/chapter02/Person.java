package chapter02;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/10 17:31
 */
public class Person {
    private final Date birthDate;
    static {
        Calendar GMT = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        GMT.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        boomStart = GMT.getTime();
        GMT.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        boomEnd = GMT.getTime();
    }

    private static Date boomStart;
    private static Date boomEnd;

    public Person() {
        birthDate = new Date();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
    }
}
