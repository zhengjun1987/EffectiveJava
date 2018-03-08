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


    /**
     * 检查字符串是否为空(包括字符串对象为null\""\"Null")
     * 异常转译/异常链
     * @author Zheng Jun
     * @throws IllegalArgumentException 检查结果为空时抛出
     */
    public static void checkNull(String argS) throws EmptyStringException {
        if (isEmpty(argS)) {
            throw new EmptyStringException(1, "参数为空!");
        }
//        Exception in thread "main" java.lang.IllegalArgumentException
//        at chapter09.ApiUtils.checkNull(ApiUtils.java:23)
//        at chapter09.ExceptionTest.test(ExceptionTest.java:13)
//        at chapter09.ExceptionTest.main(ExceptionTest.java:27)
//        Caused by: chapter09.EmptyStringException: 参数为空!
//                at chapter09.ApiUtils.checkNull(ApiUtils.java:22)
//	    ... 2 more
//
//        Process finished with exit code 1
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
