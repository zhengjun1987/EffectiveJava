package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 11:10
 */
public class WeightTable {
    public static void main(String[] args) {
        double mass = 1 / Planet.EARTH.getSurfaceGravity();
        for (Planet planet : Planet.values()) {
            System.out.printf("Weight on %s is %f%n",planet,planet.surfaceWeight(mass));
        }
    }
}
//        Weight on MERCURY is 0.377907
//        Weight on VENUS is 0.905051
//        Weight on EARTH is 1.000000
//        Weight on MARS is 0.379604
//        Weight on JUPITER is 2.529679
//        Weight on SATURN is 1.065514
//        Weight on URANUS is 0.904855
//        Weight on NEPTUNE is 1.136264
