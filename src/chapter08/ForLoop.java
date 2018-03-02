package chapter08;

import chapter02.MyUtils;
import chapter06.Planet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/2 17:33
 */
public class ForLoop {
    public static void main(String[] args) {
        Planet[] values = Planet.values();
        List<Planet> planets = Arrays.asList(values);
        java1_4styleLoop(values, planets);
        java1_5styleLoop(values, planets);
    }

    /**
     * Java1.5之后的ForEach循环隐藏了迭代器和索引变量,避免了混乱与出错的可能
     * 利用forEach不会有性能损失,用于数组也一样
     * 多个循环嵌套时,forEach的优势更明显
     * @author Zheng Jun
     */
    private static void java1_5styleLoop(Planet[] argValues, List<Planet> argPlanets) {
        for (Planet planet : argPlanets) {
            System.out.println(MyUtils.getCurrentTime() + "planet = " + planet);
        }
//        2018-03-02 17:46:20:523  planet = Planet{mass=3.302E23, radius=2439000.0, surfaceGravity=3.7040308328462537}
//        2018-03-02 17:46:20:523  planet = Planet{mass=4.869E24, radius=6052000.0, surfaceGravity=8.870805573987766}
//        2018-03-02 17:46:20:523  planet = Planet{mass=5.975E24, radius=6378000.0, surfaceGravity=9.80144268461249}
//        2018-03-02 17:46:20:523  planet = Planet{mass=6.419E23, radius=3393000.0, surfaceGravity=3.720666819023476}
//        2018-03-02 17:46:20:523  planet = Planet{mass=1.899E27, radius=7.149E7, surfaceGravity=24.794508028173404}
//        2018-03-02 17:46:20:523  planet = Planet{mass=5.685E26, radius=6.027E7, surfaceGravity=10.443575504720215}
//        2018-03-02 17:46:20:523  planet = Planet{mass=8.683E25, radius=2.556E7, surfaceGravity=8.868889152162147}
//        2018-03-02 17:46:20:523  planet = Planet{mass=1.024E26, radius=2.477E7, surfaceGravity=11.137021762915634}

        for (Planet value : argValues) {
            System.out.println(MyUtils.getCurrentTime() + "value = " + value);
        }
//        2018-03-02 17:46:20:523  value = Planet{mass=3.302E23, radius=2439000.0, surfaceGravity=3.7040308328462537}
//        2018-03-02 17:46:20:523  value = Planet{mass=4.869E24, radius=6052000.0, surfaceGravity=8.870805573987766}
//        2018-03-02 17:46:20:523  value = Planet{mass=5.975E24, radius=6378000.0, surfaceGravity=9.80144268461249}
//        2018-03-02 17:46:20:523  value = Planet{mass=6.419E23, radius=3393000.0, surfaceGravity=3.720666819023476}
//        2018-03-02 17:46:20:523  value = Planet{mass=1.899E27, radius=7.149E7, surfaceGravity=24.794508028173404}
//        2018-03-02 17:46:20:523  value = Planet{mass=5.685E26, radius=6.027E7, surfaceGravity=10.443575504720215}
//        2018-03-02 17:46:20:523  value = Planet{mass=8.683E25, radius=2.556E7, surfaceGravity=8.868889152162147}
//        2018-03-02 17:46:20:523  value = Planet{mass=1.024E26, radius=2.477E7, surfaceGravity=11.137021762915634}
    }

    /**
     * Java 1.5之前的for循环
     * 迭代器\索引变量 反复出现,很容易出错,出错后也难以发现
     * @author Zheng Jun
     */
    private static void java1_4styleLoop(Planet[] argValues, List<Planet> argPlanets) {
        //Java 1.5之前的for循环
        for (Iterator<Planet> iterator = argPlanets.iterator(); iterator.hasNext();) {
            System.out.println(MyUtils.getCurrentTime() + "iterator.next() = " + iterator.next());
        }
//        2018-03-02 17:39:22:190  iterator.next() = MERCURY
//        2018-03-02 17:39:22:190  iterator.next() = VENUS
//        2018-03-02 17:39:22:190  iterator.next() = EARTH
//        2018-03-02 17:39:22:190  iterator.next() = MARS
//        2018-03-02 17:39:22:190  iterator.next() = JUPITER
//        2018-03-02 17:39:22:190  iterator.next() = SATURN
//        2018-03-02 17:39:22:190  iterator.next() = URANUS
//        2018-03-02 17:39:22:190  iterator.next() = NEPTUNE

        //Java 1.5之前遍历数组
        for (int i = 0; i < argValues.length; i++) {
            System.out.println(MyUtils.getCurrentTime() + "values[i] = " + argValues[i]);
        }
//        2018-03-02 17:39:22:190  values[i] = MERCURY
//        2018-03-02 17:39:22:190  values[i] = VENUS
//        2018-03-02 17:39:22:190  values[i] = EARTH
//        2018-03-02 17:39:22:190  values[i] = MARS
//        2018-03-02 17:39:22:190  values[i] = JUPITER
//        2018-03-02 17:39:22:190  values[i] = SATURN
//        2018-03-02 17:39:22:190  values[i] = URANUS
//        2018-03-02 17:39:22:190  values[i] = NEPTUNE
    }
}
