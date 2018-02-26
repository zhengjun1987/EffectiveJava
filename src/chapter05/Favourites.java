package chapter05;

import chapter02.MyUtils;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/25 17:34
 */
public class Favourites {

    private final HashMap<Class, Object> mClassObjectHashMap;

    public Favourites() {
        mClassObjectHashMap = new HashMap<>();
    }

    public <T> void putFavourite(Class<T> tClass, T argT){
        mClassObjectHashMap.put(tClass,argT);
    }

    public <T> T getFavourite(Class<T> tClass){
        if (tClass == null) {
            throw new NullPointerException("Null Argument!");
        }
//        return (T) mClassObjectHashMap.get(tClass);
        return tClass.cast(mClassObjectHashMap.get(tClass));//两种强制转型的方法均可
    }

    public static void main(String[] args) {
        Favourites favourites = new Favourites();
        favourites.putFavourite(String.class,"Java");
        favourites.putFavourite(int.class,0xcafebabe);
        favourites.putFavourite(Class.class,favourites.getClass());
        System.out.printf("%s %x %s\n",
                favourites.getFavourite(String.class),
                favourites.getFavourite(Integer.class),
                favourites.getFavourite(Class.class).getSimpleName()
                );

        Class<? super List<String>> rawType = new TypeToken<List<String>>() {
        }.getRawType();
        favourites.putFavourite(rawType,new ArrayList<>(Arrays.asList("Alberta","Bridge")));
        System.out.println(MyUtils.getCurrentTime() + "favourites = " + favourites.getFavourite(rawType));
        //favourites = [Alberta, Bridge]
    }
}
//    Java cafebabe Favourites
