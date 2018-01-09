package chapter02;

/**
 * OkLine(Hangzhou) Co,ltd
 * Created by zhengjun
 * Date: 2017/11/15
 * Mail:zhengjun1987@outlook.com
 */
public interface Service {
    void test();
    default void sayHello(){
        System.out.println(MyUtils.getCurrentTime() + "Service.sayHello  " + "");
    }
}
