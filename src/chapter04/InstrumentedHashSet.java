package chapter04;

import chapter02.MyUtils;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/5 15:59
 */
public class InstrumentedHashSet<E> extends HashSet<E> {
    private int mAddCount;

    public InstrumentedHashSet() {
    }

    public InstrumentedHashSet(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor);
    }

    @Override
    public boolean add(E argE) {
        System.out.println(MyUtils.getCurrentTime() + "InstrumentedHashSet.add  " + "argE = [" + argE + "]");
        mAddCount++;
        return super.add(argE);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        System.out.println(MyUtils.getCurrentTime() + "InstrumentedHashSet.addAll  " + "c = [" + c + "]");
        mAddCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return mAddCount;
    }

    public static void main(String[] args) {
        InstrumentedHashSet<String> strings = new InstrumentedHashSet<>();
        strings.addAll(Arrays.asList("Atomic","Berkley","Cantonese"));
        System.out.println(MyUtils.getCurrentTime() + "strings.mAddCount = " + strings.getAddCount());
//        2018-02-05 16:31:13:263  strings.mAddCount = 6
//        此处仅仅添加了3个元素,而统计出来的mAddCount为6
//        原因在于HashSet的addAll方法是基于boolean add(E argE)方法的

//        删除掉覆盖的addAll方法即可修正此bug,或者在addAll方法中完全弃用super.addAll()而自己重新实现一遍
//        上述两种方法均没有解决所有的问题,后一种方法还还有可能相当麻烦

//        继承的脆弱性:超类的内部关系可能没有明文阐述(即不存在承诺)导致误用,超类的后续版本出现新的方法而继承类无法同步更新
    }
}
//        2018-02-05 17:12:23:916  InstrumentedHashSet.addAll  c = [[Atomic, Berkley, Cantonese]]
//        2018-02-05 17:12:23:917  InstrumentedHashSet.add  argE = [Atomic]
//        2018-02-05 17:12:23:917  InstrumentedHashSet.add  argE = [Berkley]
//        2018-02-05 17:12:23:917  InstrumentedHashSet.add  argE = [Cantonese]
//        2018-02-05 17:12:23:917  strings.mAddCount = 6
