package chapter04;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/23 17:36
 */
public class Host {
    private static class StrLenCmp implements Comparator<String>,Serializable {

        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }

    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();
}
