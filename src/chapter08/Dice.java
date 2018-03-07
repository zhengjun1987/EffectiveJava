package chapter08;

import chapter02.MyUtils;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/5 9:39
 */
public class Dice {
    enum DiceFace {ONE, TWO, THREE, FOUR, FIVE, SIX}

    public static void main(String[] args) {
        List<DiceFace> diceFaces = Arrays.asList(DiceFace.values());
        for (Iterator<DiceFace> i = diceFaces.iterator(); i.hasNext(); ) {
            for (Iterator<DiceFace> j = diceFaces.iterator(); j.hasNext(); ) {
                System.out.println(MyUtils.getCurrentTime() + i.next() + " " + j.next());
            }
        }
        //这段代码为什么会出现如下结果而不是预计的穷举36种组合?
        // 因为内层嵌套在调用i.next()后未经外层嵌套检查就直接把内置的index后移了一位,以至于穷尽内层嵌套循环之后,外层嵌套已经被穷尽终止循环
        // (19行的i.hasNext()只运行了2次,一次为true,一次为false)
        //
        // 如果是forEach循环,问题就会自动消失,而且使程序更简洁易读.
    }
}
//        2018-03-05 09:45:13:776  ONE ONE
//        2018-03-05 09:45:13:776  TWO TWO
//        2018-03-05 09:45:13:776  THREE THREE
//        2018-03-05 09:45:13:776  FOUR FOUR
//        2018-03-05 09:45:13:776  FIVE FIVE
//        2018-03-05 09:45:13:776  SIX SIX
//
//        Process finished with exit code 0
