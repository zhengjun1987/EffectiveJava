package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/23 16:18
 * 用子类型化精简明晰tagged class的代码
 */
abstract class SuperFigure {
    abstract double area();
}

class Circle extends SuperFigure {
    private final double mRadius;

    public Circle(double argRadius) {
        mRadius = argRadius;
    }

    @Override
    double area() {
        return Math.PI * mRadius * mRadius;
    }
}

class Rectangle extends SuperFigure {
    private final double mHeight;
    private final double mWidth;

    public Rectangle(double argHeight, double argWidth) {
        mHeight = argHeight;
        mWidth = argWidth;
    }

    @Override
    double area() {
        return mHeight * mWidth;
    }
}

class Square extends Rectangle {
    public Square(double argSide) {
        super(argSide, argSide);
    }
}