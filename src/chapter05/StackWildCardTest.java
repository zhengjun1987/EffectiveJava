package chapter05;

import chapter02.MyUtils;

import java.util.*;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/25 14:49
 */
public class StackWildCardTest {
    public static void main(String[] args) {
        Stack<Number> numberStack = new Stack<>();
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,51,56));
        numberStack.pushAll(integers);
        System.out.println(MyUtils.getCurrentTime() + "numberStack = " + numberStack);
        /*
         * 此时Stack类的pushAll方法:
         * public void pushAll(Iterable<E> argIterable){
                for (E e : argIterable) {
                push(e);
            }
          }
         * 此处出错:Stack类定义的Number类不能applied to Integer类的Iterable
         *
         * 解决办法:使用受限制的通配符? extends E
         * public void pushAll(Iterable<? extends E> argIterable){
                for (E e : argIterable) {
                    push(e);
                }
            }
         *
         * */

        Stack<Integer> stack = new Stack<>();
        stack.pushAll(integers);
        ArrayList<Number> numbers = new ArrayList<>();
        stack.popAll(numbers);
        System.out.println(MyUtils.getCurrentTime() + "numbers = " + numbers);//numbers = [56, 51, 1]
//        此处情形与上面相似,只不过方向相反,需要使用受限制的通配符 ? super E

        HashSet<Integer> integers1 = new HashSet<>(Arrays.asList(1, 5, 12));
        HashSet<Float> floats = new HashSet<>(Arrays.asList(1.2f, 2.3f, 4.5f));
        Set<? extends Number> union = Sets.unionWithGenerics(integers1, floats);
        System.out.println(MyUtils.getCurrentTime() + "union = " + union);
//        union = [2.3, 4.5, 1, 1.2, 5, 12]
        //此处也可以显式指定结果类型:
        Set<Number> numberSet = Sets.<Number>unionWithGenerics(floats, integers1);//显式的类型参数不太优雅
        System.out.println(MyUtils.getCurrentTime() + "numberSet = " + numberSet);
//        numberSet = [2.3, 4.5, 1, 1.2, 5, 12]

        Double aDouble = GenericsGrammer.maxWithWildCards(Arrays.asList(1.2, 3.8, 9.6));
        System.out.println(MyUtils.getCurrentTime() + "aDouble = " + aDouble);
    }

    public static <E> void swap(List<E> argList,int argI,int argJ){
        argList.set(argI,argList.set(argJ,argList.get(argI)));
    }
}
