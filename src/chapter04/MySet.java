package chapter04;

import java.util.AbstractSet;
import java.util.Iterator;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/24 10:05
 */
public class MySet<E> extends AbstractSet<E> {

    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    @Override
    public int size() {
        return 0;
    }

    private class MyIterator implements Iterator<E>{
        @Override
        public boolean hasNext() {
//            return size()!=0;非静态内部类持有外围类对象的引用,可以调用外围类的实例方法
            return false;
        }

        @Override
        public E next() {
            return null;
        }
    }
}
