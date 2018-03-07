package chapter09;


import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/7 15:41
 */
public class ExceptionTest {
    private static void test(String argS,int argI) throws UserException, EmptyStringException {
        ApiUtils.checkNull(argS);
        if (argI==0) {
            throw new UserException("第二个参数不得为零!");
        }
        System.out.println(MyUtils.getCurrentTime() + "ExceptionTest.test  " + "argS = [" + argS + "], argI = [" + argI + "]");
//        2018-03-07 16:01:08:960  ExceptionTest.test  argS = [TEST], argI = [2]
    }

    public static void main(String[] args) {
        String s = "NULL";
        int i = 2;
        try {
            test(s, i);
        } catch (EmptyStringException argE) {
            argE.printStackTrace();
//            chapter09.EmptyStringException: 字符串不得为空!
//                      at chapter09.ExceptionTest.test(ExceptionTest.java:13)
//                      at chapter09.ExceptionTest.main(ExceptionTest.java:25)
        } catch (UserException argE) {
            argE.printStackTrace();
//            chapter09.ExceptionTest$UserException: 第二个参数不得为零!
//                    at chapter09.ExceptionTest.test(ExceptionTest.java:16)
//                    at chapter09.ExceptionTest.main(ExceptionTest.java:25)
        }
    }

    private static class UserException extends Exception {
        public UserException(String argS) {
            super(argS);
        }
    }
}
