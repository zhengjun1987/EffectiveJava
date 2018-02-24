package chapter04;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/23 17:36
 */
public class Host {
    public Host() {
        System.out.println("Host.<init>");
    }

    private static class StrLenCmp implements Comparator<String>,Serializable {
        public StrLenCmp() {
            System.out.println("StrLenCmp.<init>");
        }

        @Override
        public int compare(String o1, String o2) {
            return o1.length()-o2.length();
        }
    }

    public static final Comparator<String> STRING_LENGTH_COMPARATOR = new StrLenCmp();

    public static void main(String[] args) {
        Host host = new Host();
    }
}
//StrLenCmp.<init>
//Host.<init>
//
//Process finished with exit code 0
