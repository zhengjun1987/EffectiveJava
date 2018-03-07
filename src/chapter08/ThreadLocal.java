package chapter08;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/3/6 11:41
 */
public abstract class ThreadLocal {
    private ThreadLocal() {
    }

    public static class Key{
        Key() {
        }
    }

    public static Key getKey(){
        return new Key();//不可伪造的键(随取随用,由系统分配,无法复制)
    }

    abstract Object get(Key argKey);
    abstract void set(Key argKey,Object object);
}
