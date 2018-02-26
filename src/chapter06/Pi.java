package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 11:40
 */
public class Pi {
    public static void main(String[] args) {
        for (double i = 2; i < 1000; i++) {
            for (double j = 1; j < i; j++) {
                double v = i / j;
                if (v > 3.1415 && v < 3.1416)
                    System.out.printf("%.2f ÷ %.2f = %.9f%n", i, j, v);
            }
        }
    }
}
//        333.00 ÷ 106.00 = 3.141509434
//        355.00 ÷ 113.00 = 3.141592920
//        666.00 ÷ 212.00 = 3.141509434
//        688.00 ÷ 219.00 = 3.141552511
//        710.00 ÷ 226.00 = 3.141592920
//        999.00 ÷ 318.00 = 3.141509434
//
//        Process finished with exit code 0
