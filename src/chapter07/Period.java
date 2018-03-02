package chapter07;

import java.util.Date;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/27 17:29
 */
public class Period {
    private final Date start;
    private final Date end;

    /**
     * 本类的构造方法
     * <p>需要两个参数,一个开始时间一个结束时间,都是Date类.</p>
     * @param argStart 开始时间
     * @param argEnd   结束时间
     * @throws NullPointerException     参数不得为空
     * @throws IllegalArgumentException 开始时间不得大于结束时间({@code start.compareTo(end)>0})
     * @author Zheng Jun
     */
    public Period(Date argStart, Date argEnd) {
        if (argStart == null) {
            throw new NullPointerException();
        }
        if (argEnd == null) {
            throw new NullPointerException();
        }
//        start = argStart;
//        end = argEnd;

        //保护性拷贝,防止构造方法中成员变量遭受异常恶意修改攻击
        start = new Date(argStart.getTime());
//        end = (Date) argEnd.clone();  对于参数类型可以被不受信任方子类化的参数,不要使用clone方法进行保护性拷贝
        end = new Date(argEnd.getTime());

        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(argStart + " After " + argEnd);
        }
    }

    /**
     * @return 成员变量的保护性拷贝
     * @author Zheng Jun
     * @see "NullTest"
     */
    public Date getStart() {
        return new Date(start.getTime());
    }

    /**
     * @return 成员变量的保护性拷贝
     * @author Zheng Jun
     */
    public Date getEnd() {
        return (Date) end.clone();
        //此处可以使用clone()方法是因为能够确定end成员变量的类型为Date(可信任的已知类型),而非某个未知的不安全扩展类
    }
}
