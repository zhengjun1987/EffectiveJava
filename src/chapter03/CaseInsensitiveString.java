package chapter03;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/29 15:05
 */
public class CaseInsensitiveString {
    public static final String STRING = "polish";
    private final String string;

    public CaseInsensitiveString(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.string = string;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return string.equalsIgnoreCase(((CaseInsensitiveString) o).string);
        }
        if (o instanceof String) {
            return string.equalsIgnoreCase((String) o);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return string.hashCode();
    }

    public static void main(String[] args) {
        CaseInsensitiveString insensitiveString = new CaseInsensitiveString("Polish");
        System.out.println(MyUtils.getCurrentTime() + "insensitiveString.equals(\"polish\") = " + insensitiveString.equals(STRING));
        System.out.println(MyUtils.getCurrentTime() + "\"polish\".equals(insensitiveString) = " + STRING.equals(insensitiveString));
    }
}
//        2018-01-29 15:28:07:209  insensitiveString.equals("polish") = true
//        2018-01-29 15:28:07:210  "polish".equals(insensitiveString) = false
//该类的equals方法设计违反了对称性原则