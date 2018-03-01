package chapter07;

import chapter02.MyUtils;

import java.util.Arrays;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/1 11:56
 */
public class VariableLengthParameters {
    /**
     * @author Zheng Jun
     * @param argInts 需要加总的数组
     * @return 数组元素总和
     */
    static int sum(int... argInts) {
        System.out.println(MyUtils.getCurrentTime() + "VariableLengthParameters.sum  " + "argInts = [" + Arrays.toString(argInts) + "]");
        System.out.println(MyUtils.getCurrentTime() + "VariableLengthParameters.sum  " + "argInts = [" + argInts.length + "]");
        int result = 0;
        for (int i : argInts) {
            result += i;
        }
        return result;
    }

    /**
     * @author Zheng Jun
     * @param firstArg 专门为第一个参数设置一个参数位,是为了确保函数调用时至少有一个参数
     * @param remainingArgs 余下的其他参数
     * @return 最小值
     */
    static int min(int firstArg,int... remainingArgs){
        int result = firstArg;
        for (int remainingArg : remainingArgs) {
            if (remainingArg < result)
                result = remainingArg;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(MyUtils.getCurrentTime() + "sum(1,2,3,4) = " + sum(1, 2, 3, 4));
        System.out.println(MyUtils.getCurrentTime() + "sum() = " + sum());
//        2018-03-01 12:00:15:800  VariableLengthParameters.sum  argInts = [[1, 2, 3, 4]]
//        2018-03-01 12:00:15:800  VariableLengthParameters.sum  argInts = [4]
//        2018-03-01 12:00:15:799  sum(1,2,3,4) = 10
//        2018-03-01 12:00:15:800  VariableLengthParameters.sum  argInts = [[]]
//        2018-03-01 12:00:15:800  VariableLengthParameters.sum  argInts = [0]
//        2018-03-01 12:00:15:800  sum() = 0

        int[] arr = {1,-1,5,-6,9};
        System.out.println(MyUtils.getCurrentTime() + "arr = " + arr);//arr = [I@5e2de80c
        System.out.println(MyUtils.getCurrentTime() + "Arrays.asList(arr) = " + Arrays.asList(arr));//Arrays.asList(arr) = [[I@5e2de80c]
        System.out.println(MyUtils.getCurrentTime() + "Arrays.asList(1,-1,5,-6,9) = " + Arrays.asList(1,-1,5,-6,9));//Arrays.asList(1,-1,5,-6,9) = [1, -1, 5, -6, 9]
        System.out.println(MyUtils.getCurrentTime() + "Arrays.toString(arr) = " + Arrays.toString(arr));//Arrays.toString(arr) = [1, -1, 5, -6, 9]

        System.out.println(MyUtils.getCurrentTime() + "min(arr[0],arr) = " + min(arr[0], arr));//这种调用方法不太优雅,但确保了参数数量至少为1
//        2018-03-01 12:08:33:849  min(arr[0],arr) = -6
    }
}
