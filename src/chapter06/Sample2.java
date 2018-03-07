package chapter06;

import chapter02.MyUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 14:26
 */
public class Sample2 {
    @ExceptionTest(ArithmeticException.class)
    public static void m1() {
        int i = 0;
        i = i / i;
    }
    @ExceptionTest({ArithmeticException.class,ArrayIndexOutOfBoundsException.class})
    public static void m2() {
        int[] ints = new int[0];
        int anInt = ints[1];
    }
    @ExceptionTest(ArithmeticException.class)
    public static void m3(){

    }

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(MyUtils.getCurrentTime() + "String.class.isInstance(\"A\") = " + String.class.isInstance("A"));//true
        int tests=0,passes=0;
        Class<?> aClass = Class.forName("chapter06.Sample2");
        for (Method method : aClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(ExceptionTest.class)) {
                tests++;
                try {
                    method.invoke(null);
                    System.out.printf("Test %s failed:no exception%n",method);
                } catch (InvocationTargetException argE) {
                    Throwable cause = argE.getCause();
                    Class<? extends Exception>[] value = method.getAnnotation(ExceptionTest.class).value();
//                    2018-02-27 15:00:44:040  cause = java.lang.ArithmeticException: / by zero
//                    2018-02-27 15:00:44:041  value = class java.lang.ArithmeticException

//                    2018-02-27 15:00:44:042  cause = java.lang.ArrayIndexOutOfBoundsException: 1
//                    2018-02-27 15:00:44:042  value = class java.lang.ArithmeticException
                    boolean testResult=false;
                    for (Class<? extends Exception> type : value) {
                        if (type.isInstance(cause)) {
                            testResult=true;
                            passes++;
                            break;
                        }
                    }
                    if (!testResult) {
                        System.out.printf("Test %s failed:expected %s, got %s%n",method, Arrays.toString(value),cause);
                    }
//                    if (value.isInstance(cause)) {
//                        passes++;
//                    } else {
//                        System.out.printf("Test %s failed:expected %s, got %s%n",method,value.getSimpleName(),cause);
//                    }
                } catch (Exception argE) {
                    System.out.println(MyUtils.getCurrentTime() +"INVALID @Test:"+method);
                }
            }
        }
        System.out.printf("PASSED: %d ,Failed: %d%n",passes,tests-passes);
    }
}
//        Test public static void chapter06.Sample2.m3() failed:no exception
//        Test public static void chapter06.Sample2.m2() failed:expected ArithmeticException, got java.lang.ArrayIndexOutOfBoundsException: 1
//        PASSED: 1 ,Failed: 2
//
//        Process finished with exit code 0

//        2018-02-27 15:28:14:505  String.class.isInstance("A") = true
//        Test public static void chapter06.Sample2.m3() failed:no exception
//        PASSED: 2 ,Failed: 1
//
//        Process finished with exit code 0
