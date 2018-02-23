package chapter04;


import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/23 14:13
 */
public class PhysicalConstantsImpl implements PhysicalConstants {
    public PhysicalConstantsImpl() {
        System.out.println(MyUtils.getCurrentTime() + "AVOCADROS_NUMBER = " + AVOCADROS_NUMBER);
    }

    public static void main(String[] args) {
        PhysicalConstantsImpl physicalConstants = new PhysicalConstantsImpl();
    }
}
