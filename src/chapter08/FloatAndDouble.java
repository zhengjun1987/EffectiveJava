package chapter08;

import chapter02.MyUtils;

import java.math.BigDecimal;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/6 9:27
 */
public class FloatAndDouble {
    public static void main(String[] args) {
        System.out.println(MyUtils.getCurrentTime() + "(1.03 - 0.42) = " + (1.03 - 0.42));
        System.out.println(MyUtils.getCurrentTime() + "(1.00 - 9 * .10) = " + (1.00 - 9 * .10));
//        2018-03-06 09:32:49:248  (1.03 - 0.42) = 0.6100000000000001
//        2018-03-06 09:32:49:248  (1.00 - 9 * .10) = 0.09999999999999998

        double funds = 1.00;
        int itemsBought = 0;
        for (double price = 0.10; price <= funds; price += .10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(MyUtils.getCurrentTime() + "itemsBought = " + itemsBought);
        System.out.println(MyUtils.getCurrentTime() + "funds = " + funds);
//        2018-03-06 09:32:49:248  itemsBought = 3
//        2018-03-06 09:32:49:248  funds = 0.3999999999999999

        System.out.println(MyUtils.getCurrentTime() + "===============================" + "==============================");

        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        itemsBought = 0;
        BigDecimal new_funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; price.compareTo(new_funds) <= 0; price = price.add(TEN_CENTS)) {
            new_funds = new_funds.subtract(price);
            itemsBought++;
        }
        System.out.println(MyUtils.getCurrentTime() + "itemsBought = " + itemsBought);
        System.out.println(MyUtils.getCurrentTime() + "new_funds = " + new_funds);
//        2018-03-06 09:42:19:918  itemsBought = 4
//        2018-03-06 09:42:19:918  new_funds = 0.00
    }
}
