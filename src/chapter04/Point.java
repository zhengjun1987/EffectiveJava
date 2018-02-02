package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/2 11:27
 */
public class Point {
    private double mX;
    private double mY;

    public Point(double argX, double argY) {
        mX = argX;
        mY = argY;
    }

    public double getX() {
        return mX;
    }

    public void setX(double argX) {
        mX = argX;
    }

    public double getY() {
        return mY;
    }

    public void setY(double argY) {
        mY = argY;
    }
}
