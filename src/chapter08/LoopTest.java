package chapter08;

import chapter02.MyUtils;
import chapter06.Phase;
import chapter06.Planet;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author  Zheng Jun
 * Mail: zhengjun1987@outlook.com
 * Date: 2018/3/2 16:17
 */
public class LoopTest {
    public static void main(String[] args) {
        Iterator<Planet> iterator1 = Arrays.asList(Planet.values()).iterator();
        while (iterator1.hasNext()) {
            System.out.println(MyUtils.getCurrentTime() + "iterator1.next() = " + iterator1.next());
        }

        Iterator<Phase> iterator2 = Arrays.asList(Phase.values()).iterator();
        while (iterator1.hasNext()) {   //此处"复制-粘贴错误":本想使用iterator2,而iterator1仍然处于有效范围内
            //如果iterator2的size一直少于iterator1,不仅仅错误难以发现,导致的后果也是相当严重的
            //改用for循环之后可以避免此类错误风险
            System.out.println(MyUtils.getCurrentTime() + "iterator2.next() = " + iterator2.next());
        }
    }
}
//        2018-03-02 16:30:04:225  iterator1.next() = MERCURY
//        2018-03-02 16:30:04:225  iterator1.next() = VENUS
//        2018-03-02 16:30:04:225  iterator1.next() = EARTH
//        2018-03-02 16:30:04:225  iterator1.next() = MARS
//        2018-03-02 16:30:04:225  iterator1.next() = JUPITER
//        2018-03-02 16:30:04:225  iterator1.next() = SATURN
//        2018-03-02 16:30:04:225  iterator1.next() = URANUS
//        2018-03-02 16:30:04:225  iterator1.next() = NEPTUNE
//
//        Process finished with exit code 0
