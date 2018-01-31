package chapter03;

import chapter02.MyUtils;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/30 11:27
 */
public class PhoneNumber implements Comparable<PhoneNumber> {
    private final short mAreaCode;
    private final short mPrefix;
    private final short mLineNumber;
    private int mHashCode;

    public PhoneNumber(int argAreaCode, int argPrefix, int argLineNumber) {
        rangeCheck(argAreaCode, 999, "area code");
        rangeCheck(argPrefix, 999, "prefix");
        rangeCheck(argLineNumber, 9999, "line number");
        mAreaCode = (short) argAreaCode;
        mPrefix = (short) argPrefix;
        mLineNumber = (short) argLineNumber;
    }

    private static void rangeCheck(int argNumber, int max, String argS) {
        if ((argNumber < 0 || argNumber > max)) {
            throw new IllegalArgumentException(argS + ": " + argNumber);
        }
    }

    @Override
    public boolean equals(Object argO) {
        if (this == argO) return true;
        if (argO == null || getClass() != argO.getClass()) return false;

        PhoneNumber that = (PhoneNumber) argO;

        if (mAreaCode != that.mAreaCode) return false;
        if (mPrefix != that.mPrefix) return false;
        return mLineNumber == that.mLineNumber;
    }

    @Override
    public int hashCode() {
        int result = mHashCode;//延迟初始化
        if (result == 0) {//用成员变量记录散列值,无需重复计算
            result = (int) mAreaCode;
            result = 31 * result + (int) mPrefix;
            result = 31 * result + (int) mLineNumber;
            mHashCode = result;
        }
        return result;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "mAreaCode=" + mAreaCode +
                ", mPrefix=" + mPrefix +
                ", mLineNumber=" + mLineNumber +
                ", mHashCode=" + mHashCode +
                '}';
    }


    @Override
    public PhoneNumber clone() {
        PhoneNumber clone = null;
        try {
            clone = (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException argE) {
            argE.printStackTrace();
        }
        return clone;
    }

    public static void main(String[] args) {
        HashMap<PhoneNumber, String> numberStringHashMap = new HashMap<>();
        PhoneNumber key = new PhoneNumber(707, 867, 5309);
        numberStringHashMap.put(key, "Jenny");
        System.out.println(MyUtils.getCurrentTime() + "key.toString() = " + key.toString());
        System.out.println(MyUtils.getCurrentTime() + "numberStringHashMap.get(new PhoneNumber(707,867,5309)) = " + numberStringHashMap.get(new PhoneNumber(707, 867, 5309)));
    }

    @Override
    public int compareTo(@NotNull PhoneNumber o) {
        int i = mAreaCode - o.mAreaCode;
        if (i != 0) {
            return i;
        }
        int j = mPrefix - o.mPrefix;
        if (j != 0) {
            return j;
        }
        return mLineNumber - o.mLineNumber;
    }
}
//2018-1-30 14:58:18版本(只覆盖了equals方法,没有覆盖hashCode方法)
//2018-01-30 14:57:47:392  numberStringHashMap.get(new PhoneNumber(707,867,5309)) = null

//2018-1-30 15:00:03版本(equals\hashCode方法都已覆盖)
//2018-01-30 14:59:41:642  numberStringHashMap.get(new PhoneNumber(707,867,5309)) = Jenny
