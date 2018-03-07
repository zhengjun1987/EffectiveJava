package chapter04;

import chapter02.MyUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/5 17:29
 */
public class InstrumentedSet<E> extends ForwardingSet<E> {
    private int mAddCount;

    public InstrumentedSet(Set<E> argSet) {
        super(argSet);
        mAddCount += argSet.size();
        System.out.println(MyUtils.getCurrentTime() + "InstrumentedSet.<init>  " + "argSet = [" + argSet + "]");
    }

    @Override
    public boolean add(E argE) {
        System.out.println(MyUtils.getCurrentTime() + "InstrumentedSet.add  " + "argE = [" + argE + "]");
        mAddCount++;
        return super.add(argE);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> c) {
        System.out.println(MyUtils.getCurrentTime() + "InstrumentedSet.addAll  " + "c = [" + c + "]");
        mAddCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return mAddCount;
    }

    public static void main(String[] args) {
        InstrumentedSet<String> strings = new InstrumentedSet<>(new HashSet<>(Arrays.asList("Antique")));
        strings.addAll(Arrays.asList("Berckley","Cantonese","Duke"));
        System.out.println(MyUtils.getCurrentTime() + "strings.getAddCount() = " + strings.getAddCount());
    }
}
//        2018-02-05 17:54:28:490  InstrumentedSet.<init>  argSet = [[Antique]]
//        2018-02-05 17:54:28:491  InstrumentedSet.addAll  c = [[Berckley, Cantonese, Duke]]
//        2018-02-05 17:54:28:491  strings.getAddCount() = 4
