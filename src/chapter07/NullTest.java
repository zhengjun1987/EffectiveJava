package chapter07;

import chapter02.MyUtils;
import org.jetbrains.annotations.NotNull;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/28 9:32
 */
public class NullTest {
    private final String name;

    NullTest(@NotNull String argName) {
        assert argName != null;
        name = argName;
    }

    public static void main(String[] args) {
        NullTest nullTest = new NullTest(null);
        System.out.println(MyUtils.getCurrentTime() + "nullTest = " + nullTest);
    }
}
//        Exception in thread "main" java.lang.IllegalArgumentException: Argument for @NotNull parameter 'argName' of chapter07/NullTest.<init> must not be null
//        at chapter07.NullTest.$$$reportNull$$$0(NullTest.java)
//        at chapter07.NullTest.<init>(NullTest.java)
//        at chapter07.NullTest.main(NullTest.java:20)
//
//        Process finished with exit code 1
