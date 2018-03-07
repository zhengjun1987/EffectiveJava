package chapter04;

import org.jetbrains.annotations.NotNull;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/5 17:37
 */
public class ForwardingSet<E> implements Set<E> {
    private final Set<E> mSet;

    public ForwardingSet(Set<E> argSet) {
        mSet = argSet;
    }

    @Override
    public int size() {
        return mSet.size();
    }

    @Override
    public boolean isEmpty() {
        return mSet.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return mSet.contains(o);
    }

    @NotNull
    @Override
    public Iterator<E> iterator() {
        return mSet.iterator();
    }

    @NotNull
    @Override
    public Object[] toArray() {
        return mSet.toArray();
    }

    @NotNull
    @Override
    public <T> T[] toArray(@NotNull T[] a) {
        return mSet.toArray(a);
    }

    @Override
    public boolean add(E argE) {
        return mSet.add(argE);
    }

    @Override
    public boolean remove(Object o) {
        return mSet.remove(o);
    }

    @Override
    public boolean containsAll(@NotNull Collection<?> c) {
        return mSet.containsAll(c);
    }

    @Override
    public boolean addAll(@NotNull Collection<? extends E> c) {
        return mSet.addAll(c);
    }

    @Override
    public boolean retainAll(@NotNull Collection<?> c) {
        return mSet.retainAll(c);
    }

    @Override
    public boolean removeAll(@NotNull Collection<?> c) {
        return mSet.removeAll(c);
    }

    @Override
    public void clear() {
        mSet.clear();
    }
}
