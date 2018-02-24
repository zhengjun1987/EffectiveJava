package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/23 14:04
 * 常量表达的反面典型:用接口存储常量,导致后续无法更改\删除该接口(public的东西就是一种承诺)
 */
public interface PhysicalConstants {
    static final double AVOCADROS_NUMBER = 6.02214199e23;
    static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
    static final double ELECTRONIC_MASS = 9.10938188e-31;
}
