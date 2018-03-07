package chapter09;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/7 17:45
 */
public class ApiUtils {
    private ApiUtils() {
        throw new UnsupportedOperationException();
    }

    public static boolean isEmpty(String argS) {
        if (argS == null || argS.equals("") || argS.equalsIgnoreCase("null")) {
            return true;
        }
        return false;
    }

    public static void checkNull(String argS) throws EmptyStringException {
        if (isEmpty(argS)) {
            throw new EmptyStringException(1,"参数为空!");
        }
    }

    public static void checkNull(Object argS) throws IllegalArgumentException {
        if (argS == null) {
            throw new IllegalArgumentException("参数为空!");
        }
    }

    public static void main(String[] args) throws EmptyStringException {
        String s = "NULL";
        checkNull(s);
    }
}
