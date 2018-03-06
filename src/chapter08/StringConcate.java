package chapter08;

import chapter02.MyUtils;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/6 15:07
 */
public class StringConcate {
    public static void main(String[] args) {
        String s = "Hello,";
        String concat = s.concat("World!");
        System.out.println(MyUtils.getCurrentTime() + "s = " + s);
        System.out.println(MyUtils.getCurrentTime() + "concat = " + concat);

        long start = System.nanoTime();
        String result2 = new StringBuffer("富强")
                .append("民主")
                .append("文明")
                .append("和谐")
                .append("自由")
                .append("平等")
                .append("公正")
                .append("法制")
                .append("爱国")
                .append("敬业")
                .append("诚信")
                .append("友善")
                .toString();
        long end1 = System.nanoTime();
        String result = "富强"+"民主"+"文明"+"和谐"+"自由"+"平等"+"公正"+"法治"+"爱国"+"敬业"+"诚信"+"友善";
        long end2 = System.nanoTime();
        System.out.println(MyUtils.getCurrentTime() + "(end1 - start) = " + (end1 - start));
        System.out.println(MyUtils.getCurrentTime() + "(end2 - end1) = " + (end2 - end1));
    }
}
