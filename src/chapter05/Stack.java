package chapter05;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/25 9:47
 */
public class Stack<E> {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    private E[] mObjects;
    private int mSize;

    @SuppressWarnings("unchecked")
    public Stack() {
        mObjects = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(E object) {
        ensureCapacity();
        mObjects[mSize++] = object;
    }

    private void ensureCapacity() {
        if (mSize == mObjects.length) {
            mObjects = Arrays.copyOf(mObjects, 2 * mSize + 1);
        }
    }

    public E pop(){
        if (mSize==0) {
            throw new EmptyStackException();
        }
        E object = mObjects[--mSize];
        mObjects[mSize] = null;
        return object;
    }

    @Override
    public Stack clone() {
        Stack clone = null;
        try {
            clone = (Stack) super.clone();
            clone.mObjects = mObjects.clone();
        } catch (CloneNotSupportedException argE) {
            argE.printStackTrace();
        }
        return clone;
    }

    public void pushAll(Iterable<? extends E> argIterable){
        for (E e : argIterable) {
            push(e);
        }
    }

    public void popAll(Collection<? super E> argCollection){
        while (mSize!=0) {
            argCollection.add(pop());
        }
    }
}
