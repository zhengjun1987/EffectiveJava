package chapter06;

import chapter02.MyUtils;

import java.util.EnumMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/26 16:34
 */
public class Herb {
    public enum Type {ANNUAL, PERENNIAL, BIENIAL}

    private final String name;
    private final Type mType;

    public Herb(String argName, Type argType) {
        name = argName;
        mType = argType;
    }

    @Override
    public String toString() {
        return "Herb{" +
                "name='" + name + '\'' +
                ", mType=" + mType +
                '}';
    }

    public static void main(String[] args) {
//        Set<Herb>[] herbsByType = new HashSet<Herb>[Type.values().length];
        EnumMap<Type, HashSet<Herb>> typeHashSetEnumMap = new EnumMap<>(Type.class);
        for (Type type : Type.values()) {
            typeHashSetEnumMap.put(type,new HashSet<>());
        }
        System.out.println(MyUtils.getCurrentTime() + "typeHashSetEnumMap = " + typeHashSetEnumMap);//{ANNUAL=[], PERENNIAL=[], BIENIAL=[]}
    }
}
