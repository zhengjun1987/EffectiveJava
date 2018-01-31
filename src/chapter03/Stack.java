package chapter03;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/31 14:36
 */
public class Stack {
    public static final int DEFAULT_INITIAL_CAPACITY = 16;
    private Object[] mObjects;
    private int mSize;

    public Stack() {
        mObjects = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object object) {
        ensureCapacity();
        mObjects[mSize++] = object;
    }

    private void ensureCapacity() {
        if (mSize == mObjects.length) {
            mObjects = Arrays.copyOf(mObjects, 2 * mSize + 1);
        }
    }

    public Object pop(){
        if (mSize==0) {
            throw new EmptyStackException();
        }
        Object object = mObjects[--mSize];
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
}
