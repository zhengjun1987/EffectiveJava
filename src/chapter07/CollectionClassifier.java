package chapter07;

import chapter02.MyUtils;

import java.util.*;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/28 16:24
 */
public class CollectionClassifier {
    public static String classify(Set<?> argObjects) {
        return "Set";
    }

    public static String classify(List<?> argObjects) {
        return "List";
    }

    public static String classify(Collection<?> argObjects) {
//        return "Unknown Collection";
//        2018-02-28 16:36:40:346  classify(collection) = Unknown Collection
//        2018-02-28 16:36:40:347  classify(collection) = Unknown Collection
//        2018-02-28 16:36:40:347  classify(collection) = Unknown Collection
//
//        Process finished with exit code 0

        return argObjects instanceof Set ?
                "Set" : argObjects instanceof List ?
                "List" : "Unknown Collection";
//        2018-02-28 17:56:51:385  classify(collection) = Set
//        2018-02-28 17:56:51:386  classify(collection) = List
//        2018-02-28 17:56:51:386  classify(collection) = Unknown Collection
//
//        Process finished with exit code 0
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {new HashSet<String>(), new ArrayList<String>(), new HashMap<String, String>().values()};
        for (Collection<?> collection : collections) {
            System.out.println(MyUtils.getCurrentTime() + "classify(collection) = " + classify(collection));
            //对于重载方法overloaded method的选择是静态的(编译时就已经决定),对被覆盖的方法overriden method的选择的选择是动态的(实际运行时才决定)
        }
    }
}
