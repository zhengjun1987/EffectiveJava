package chapter04;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/23 15:02
 * 充斥着样板代码的标签类tagged class
 */
public class Figure {
    enum Shape {RECTANGLE, CIRCLE}

    final Shape mShape;
    double mWidth;
    double mHeight;
    double mRadius;

    public Figure(double argRadius) {
        mRadius = argRadius;
        mShape = Shape.CIRCLE;
    }

    public Figure(double argWidth, double argHeight) {
        mWidth = argWidth;
        mHeight = argHeight;
        mShape = Shape.RECTANGLE;
    }

    double area() {
        switch (mShape) {
            case CIRCLE:
                return Math.PI * mRadius * mRadius;
            case RECTANGLE:
                return mHeight * mWidth;
        }
        return 0;
    }
}
