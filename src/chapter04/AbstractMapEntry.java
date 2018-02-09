package chapter04;

import java.util.Map;

/**
 * Author:Zheng Jun
 * E-mail:zhengjun1987@outlook.com
 * Date:2018/2/9 22:21
 * Project:EffectiveJava
 */
public abstract class AbstractMapEntry<K, V> implements Map.Entry<K, V> {
    @Override
    public abstract K getKey();

    @Override
    public abstract V getValue();

    @Override
    public int hashCode() {
        return hashCode(getKey()) ^ hashCode(getValue());
    }

    private static int hashCode(Object o) {
        return o == null ? 0 : o.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this) {
            return true;
        }
        if (!(obj instanceof AbstractMapEntry)) {
            return false;
        }
        AbstractMapEntry mapEntry = (AbstractMapEntry) obj;
        return equals(getKey(),mapEntry.getKey()) && equals(getValue(),mapEntry.getValue());
    }

    private static boolean equals(Object o1,Object o2){
        return o1==null?o2==null:o1.equals(o2);

    }
}
