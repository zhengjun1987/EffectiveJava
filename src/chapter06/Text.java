package chapter06;

import chapter02.MyUtils;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 15:38
 */
public class Text {
    public static final int STYLE_BOLD = 1 << 0;
    public static final int STYLE_ITALIC = 1 << 1;
    public static final int STYLE_UNDERLINE = 1 << 2;
    public static final int STYLE_STRIKETHROUGH = 1 << 3;

    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    private Set<Style> mStyles;//客户端可能会有特殊的EnumSet实现需要,所以记作Set类型

    {
        mStyles = EnumSet.of(Style.BOLD, Style.ITALIC);
    }

    public boolean getStyleBoolean(int style, int feature) {
        return (style & feature) == feature;
    }

    public static void main(String[] args) {
        System.out.println(MyUtils.getCurrentTime() + "STYLE_BOLD|STYLE_ITALIC = " + (STYLE_BOLD | STYLE_ITALIC));//STYLE_BOLD|STYLE_ITALIC = 3
        int style = STYLE_ITALIC | STYLE_BOLD;
        System.out.println(MyUtils.getCurrentTime() + style);//3
        System.out.println(MyUtils.getCurrentTime() + ((style & STYLE_UNDERLINE) == STYLE_UNDERLINE));
        System.out.println(MyUtils.getCurrentTime() + ((style & STYLE_ITALIC) == STYLE_ITALIC));
        System.out.println(MyUtils.getCurrentTime() + (STYLE_BOLD | STYLE_ITALIC | STYLE_UNDERLINE | STYLE_STRIKETHROUGH));//15

        Text text = new Text();
        System.out.println(MyUtils.getCurrentTime() + "text.mStyles = " + text.mStyles);//text.mStyles = [BOLD, ITALIC]
        text.mStyles.add(Style.UNDERLINE);
        System.out.println(MyUtils.getCurrentTime() + "text.mStyles = " + text.mStyles);//text.mStyles = [BOLD, ITALIC, UNDERLINE]
        System.out.println(MyUtils.getCurrentTime() + "text.mStyles.contains(Style.STRIKETHROUGH) = " + text.mStyles.contains(Style.STRIKETHROUGH));//false

    }
}
