package chapter03;

import java.awt.*;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/29 17:33
 */
public class ColorPoint2 {
    private Point mPoint;
    private Color mColor;

    public ColorPoint2(int varX,int varY,Color varColor) {
        mPoint = new Point(varX,varY);
        mColor = varColor;
    }

    public Point asPoint() {
        return mPoint;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ColorPoint2)) {
            return false;
        }
        ColorPoint2 colorPoint2 = (ColorPoint2) obj;
        return mColor.equals(colorPoint2.mColor) && mPoint.equals(colorPoint2.mPoint);
    }
}
