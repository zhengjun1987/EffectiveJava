package chapter06;

import chapter02.MyUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 11:39
 */
public class RunTests {
    public static void main(String[] args) throws ClassNotFoundException {
        int tests = 0,passes=0;
        Class<?> aClass = Class.forName("chapter06.Sample");
        for (Method method : aClass.getDeclaredMethods()) {
            if (method.isAnnotationPresent(Test.class)) {
                tests++;
                try {
                    method.invoke(null);
                    passes++;
                } catch (InvocationTargetException argE) {
                    System.out.println(MyUtils.getCurrentTime() + "argE.getCause() = " + argE.getCause());
                } catch (Exception argE) {
                    System.out.println(MyUtils.getCurrentTime() + "INVALID @Test " + method);
                }
            }
        }
        System.out.printf("PASSED: %d ,Failed: %d%n",passes,tests-passes);
    }
}
//        Sample.m7
//        2018-02-27 14:16:49:460  argE.getCause() = java.lang.RuntimeException: Crash!
//        Sample.m3
//        2018-02-27 14:16:49:460  argE.getCause() = java.lang.RuntimeException: Boom!
//        2018-02-27 14:16:49:460  INVALID @Test public void chapter06.Sample.m5()
//        Sample.m1
//        PASSED: 1 ,Failed: 3
//
//        Process finished with exit code 0
