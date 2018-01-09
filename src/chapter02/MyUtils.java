package chapter02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/9 16:56
 */
public class MyUtils {
    public static String getCurrentTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS  ").format(new Date());
    }
}
