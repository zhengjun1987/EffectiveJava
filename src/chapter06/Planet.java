package chapter06;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 10:33
 */
public enum Planet {
    MERCURY(3.302e23,2.439e6),
    VENUS(4.869e24,6.052e6),
    EARTH(5.975E24,6.378E6),
    MARS(6.419E23,3.393E6),
    JUPITER(1.899E27,7.149E7),
    SATURN(5.685E26,6.027E7),
    URANUS(8.683E25,2.556E7),
    NEPTUNE(1.024E26,2.477E7)
    ;

    private final double mass;
    private final double radius;
    private final double surfaceGravity;

    private final static double G = 6.673E-11;

    Planet(double argMass, double argRadius) {
        mass = argMass;
        radius = argRadius;
        surfaceGravity = G * mass / (radius * radius);
    }

    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double getSurfaceGravity() {
        return surfaceGravity;
    }

    public double surfaceWeight(double mass) {
        return mass * surfaceGravity;
    }
}
