package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 15:09
 */
public enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5), SEXTET(6), SEPTET(7), OCTET(8), NONET(9), DECTET(10);

    private final int numberOfMusicians;

    Ensemble(int argNumberOfMusicians) {
        numberOfMusicians = argNumberOfMusicians;
    }

    public int numberOfMusicians() {
//        return ordinal() + 1; 不要根据枚举的ordinal导出其相关的值,应该另外设置一个成员变量
        //除非是处理枚举相关的数据结构,不要使用ordinal()方法
        return numberOfMusicians;
    }
}
