package chapter07;

import chapter02.MyUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/1 14:37
 * @author Zheng Jun
 */
public class CheeseShop {
    private List<Cheese> mCheeseList = new ArrayList<>();
    {
        mCheeseList.add(new Cheese());
    }

    /**
     * @author Zheng Jun
     * @return Cheese array
     */
    public Cheese[] getCheeses() {
//        if (mCheeseList.isEmpty()) {
//            return null;
//        } else {
//            return (Cheese[]) mCheeseList.toArray();
//        }
        Cheese[] res = new Cheese[mCheeseList.size()];
        for (int i = 0; i < mCheeseList.size(); i++) {
            res[i] = mCheeseList.get(i);
        }
        return res;
    }

    /**
     * main function
     * @author Zheng Jun
     * @param args parameters from command
     *
     */
    public static void main(String[] args) {
        CheeseShop cheeseShop = new CheeseShop();
        Cheese[] cheeses = cheeseShop.getCheeses();
        System.out.println(MyUtils.getCurrentTime() + "cheeseShop.getCheeses() = " + cheeses);
        if (cheeses != null) {
            System.out.println(MyUtils.getCurrentTime() + "cheeses = " + cheeses);
        }
    }
}

class Cheese {

}
