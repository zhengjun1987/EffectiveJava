package chapter02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/9 16:56
 */
public final class MyUtils {
    //类修饰符final确保该类不会被扩展,私有构造器确保该类不会被实例化
    private MyUtils() {
        throw new AssertionError();
    }

    public static String getCurrentTime() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS  ").format(new Date());
    }

    public static byte[] String2ByteAry(String str) {
//        int arrLength = (str.length() % 2 == 1) ? (str.length() / 2 + 1) : (str.length() / 2);

        int strLength = str.length();
        int arrLength = strLength / 2;
        if (strLength % 2 == 1) {
            ++arrLength;
        }

        byte[] btAry = new byte[arrLength];
        int index = 0;

        for (int j = 0; j < strLength; ++j) {
            char c = str.charAt(j);
            int b;
            if (c >= 48 && c <= 57) {
                b = c - 48;
            } else if (c >= 97 && c <= 102) {
                b = c - 97 + 10;
            } else {
                if (c < 65 || c > 70) {
                    break;
                }

                b = c - 65 + 10;
            }

            if (j % 2 == 1) {
                btAry[index] = (byte) (btAry[index] | b & 255);
                ++index;
            } else {
                btAry[index] = (byte) (b << 4 & 255);
            }
        }

        return btAry;
    }

    public static void main(String[] args) {
        for (int i = 0; i <= 102; i++) {
            System.out.println(MyUtils.getCurrentTime() + "i = " + i+ "       char = " + (char)i);
        }
    }
}
