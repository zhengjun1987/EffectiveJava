package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 10:18
 */
public class ArithmeticOperationTest {
    public static void main(String[] args) {
        test(ArithmeticOperationEnum.class,5.0f,2.5f);
        test(ExtendedArithmeticOperationEnum.class,5.0f,2.5f);
    }

    public static <T extends Enum<T> & ArithmeticOperation> void test(Class<T> tClass,double x,double y){
        for (T t : tClass.getEnumConstants()) {
            System.out.printf("%.2f %s %.2f = %.6f%n",x,t.toString(),y,t.apply(x,y));
        }
    }
}
//        5.00 + 2.50 = 7.500000
//        5.00 - 2.50 = 2.500000
//        5.00 * 2.50 = 12.500000
//        5.00 / 2.50 = 2.000000
//        5.00 ^ 2.50 = 55.901699
//        5.00 % 2.50 = 0.000000
//
//        Process finished with exit code 0
