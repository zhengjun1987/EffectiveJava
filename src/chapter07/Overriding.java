package chapter07;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/28 17:27
 */
public class Overriding {
    public static void main(String[] args) {
        Wine[] wines = {new Wine(),new SparklingWine(),new Champagne()};
        for (Wine wine : wines) {
            System.out.println(MyUtils.getCurrentTime() + "wine.name() = " + wine.name());
        }
    }
}
//        Wine.name
//        2018-02-28 17:30:57:623  wine.name() = Wine
//        Wine.name
//        2018-02-28 17:30:57:623  wine.name() = SparklingWine
//        Wine.name
//        2018-02-28 17:30:57:623  wine.name() = Champagne
//
//        Process finished with exit code 0

class Wine {
    String name(){
        System.out.println("Wine.name");
        return getClass().getSimpleName();
    }
}

class SparklingWine extends Wine {
    @Override
    String name() {
        System.out.println("SparklingWine.name");
        return "SparklingWine";
    }
}

class Champagne extends SparklingWine {
    @Override
    String name() {
        System.out.println("Champagne.name");
        return "Champagne";
    }
}
//        Wine.name
//        2018-02-28 17:33:29:721  wine.name() = Wine
//        SparklingWine.name
//        2018-02-28 17:33:29:722  wine.name() = SparklingWine
//        Champagne.name
//        2018-02-28 17:33:29:722  wine.name() = Champagne
