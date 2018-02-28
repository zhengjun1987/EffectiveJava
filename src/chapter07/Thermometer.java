package chapter07;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/28 16:07
 */
public class Thermometer {
    public static enum TemperatureScale {
        FAHRENHEIT, CELSIUS
    }

    public static double exchange(TemperatureScale origin, double temp) {
        switch (origin) {
            case FAHRENHEIT:
                return (temp - 32) / 1.8;
            case CELSIUS:
                return temp * 1.8 + 32;
        }
        throw new IllegalStateException("Unexpected ERROR!");
    }

    public static double exchange(boolean isFahr, double temp) {
        return isFahr ? (temp - 32) / 1.8 : temp * 1.8 + 32;
    }

    public static void main(String[] args) {
        System.out.println(MyUtils.getCurrentTime() + "Thermometer.exchange(false,32) = " + Thermometer.exchange(false, 32));
        System.out.println(MyUtils.getCurrentTime() + "Thermometer.exchange(TemperatureScale.CELSIUS,32) = " + Thermometer.exchange(TemperatureScale.CELSIUS, 32));
        System.out.println(MyUtils.getCurrentTime() + "Thermometer.exchange(true,32) = " + Thermometer.exchange(true, 32));
        System.out.println(MyUtils.getCurrentTime() + "Thermometer.exchange(TemperatureScale.FAHRENHEIT,32) = " + Thermometer.exchange(TemperatureScale.FAHRENHEIT, 32));
    }
}
//        2018-02-28 16:18:36:013  Thermometer.exchange(false,32) = 89.6
//        2018-02-28 16:18:36:015  Thermometer.exchange(TemperatureScale.CELSIUS,32) = 89.6
//        2018-02-28 16:18:36:015  Thermometer.exchange(true,32) = 0.0
//        2018-02-28 16:18:36:015  Thermometer.exchange(TemperatureScale.FAHRENHEIT,32) = 0.0
