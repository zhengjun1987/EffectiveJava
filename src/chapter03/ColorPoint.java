package chapter03;

import chapter02.MyUtils;

import java.awt.*;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/29 15:53
 */
public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }

        //修正方法
        if (!(o instanceof ColorPoint)) {
            return o.equals(this);
        }

        return super.equals(o) && ((ColorPoint) o).color.equals(color);
    }

    public static void main(String[] args) {
        Point point = new Point(11, 12);
        ColorPoint colorPoint = new ColorPoint(11, 12, Color.BLACK);
        ColorPoint colorPoint1 = new ColorPoint(11, 12, Color.RED);
        System.out.println(MyUtils.getCurrentTime() + "point.equals(colorPoint) = " + point.equals(colorPoint));
        System.out.println(MyUtils.getCurrentTime() + "colorPoint.equals(point) = " + colorPoint.equals(point));

        //2018年1月29日16:40:21版本  提供了对称性,牺牲了传递性
        System.out.println(MyUtils.getCurrentTime() + "colorPoint.equals(point) = " + colorPoint.equals(point));
        System.out.println(MyUtils.getCurrentTime() + "point.equals(colorPoint1) = " + point.equals(colorPoint1));
        System.out.println(MyUtils.getCurrentTime() + "colorPoint1.equals(colorPoint) = " + colorPoint1.equals(colorPoint));
//        2018-01-29 16:42:13:572  colorPoint.equals(point) = true
//        2018-01-29 16:42:13:572  point.equals(colorPoint1) = true
//        2018-01-29 16:42:13:572  colorPoint1.equals(colorPoint) = false
//        这是面向对象编程语言中关于等价关系的一个基本问题,我们无法在可实例化类型的同时又保留equals约定
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", color=" + color +
                '}';
    }
}
//        2018-01-29 16:24:38:954  point.equals(colorPoint) = true
//        2018-01-29 16:24:38:954  colorPoint.equals(point) = false     此处违反了对称性
