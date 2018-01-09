package chapter02;

import org.jetbrains.annotations.Contract;

import java.io.Serializable;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/9 18:10
 */
public class Elvis implements Serializable {
    private static final Elvis INSTANCE = new Elvis();

    private Elvis() {
        //抵御反射机制攻击
        if (INSTANCE != null) {
            throw new UnsupportedOperationException();
        }
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    @Contract(pure = true)
    private Object readResolve(){
        return INSTANCE;
    }

}
