package chapter05;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/25 11:37
 */
public class UnaryTest {
    private static UnaryFunction<Object> IDENTITY_FUNCTION = new UnaryFunction<Object>() {
        @Override
        public Object apply(Object argO) {
            return argO;
        }
    };

    @SuppressWarnings("unchecked")
    public static <T> UnaryFunction<T> identityFunction(){
        return (UnaryFunction<T>) IDENTITY_FUNCTION;//@SuppressWarnings("unchecked")
    }

    public static void main(String[] args) {
        String[] strings = {"jute", "hemp", "nylon"};
        UnaryFunction<String> sameString = identityFunction();
        for (String string : strings) {
            System.out.println(MyUtils.getCurrentTime() + "sameString.apply(string) = " + sameString.apply(string));
        }
        Number[] numbers = {1,2.0f,3L};
        UnaryFunction<Number> numberUnaryFunction = identityFunction();
        for (Number number : numbers) {
            System.out.println(MyUtils.getCurrentTime() + "numberUnaryFunction = " + numberUnaryFunction.apply(number));
        }
    }
}
//        2018-02-25 12:03:43:355  sameString.apply(string) = jute
//        2018-02-25 12:03:43:355  sameString.apply(string) = hemp
//        2018-02-25 12:03:43:355  sameString.apply(string) = nylon
//        2018-02-25 12:03:43:355  numberUnaryFunction = 1
//        2018-02-25 12:03:43:355  numberUnaryFunction = 2.0
//        2018-02-25 12:03:43:355  numberUnaryFunction = 3
