package chapter02;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * OkLine(Hangzhou) Co,ltd
 * Created by zhengjun
 * Date: 2017/11/15
 * Mail:zhengjun1987@outlook.com
 */
public class Services {
    private Services() {
    }

    private static final Map<String,Provider> map = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider provider){
        map.put(DEFAULT_PROVIDER_NAME,provider);
    }

    public static void registerProvider(String name,Provider provider){
        map.put(name,provider);
    }

    public static Service newInstance(String name){
        Provider provider = map.get(name);
        if (provider == null) {
            throw new IllegalArgumentException("该名称的Provider不存在");
        }
        return provider.newService();
    }

    public static void main(String[] args) {
        //Provider注册一个默认服务
        Services.registerDefaultProvider(new Provider() {
            @Override
            public Service newService() {
                return new Service() {
                    @Override
                    public void test() {
                        System.out.println(MyUtils.getCurrentTime() + "Services.test  " + "");
                        sayHello();
                    }
                };
            }
        });


        //客户端访问默认服务
        Services.newInstance("<def>").test();
    }
}
//        2018-01-09 17:06:10:196  Services.test
//        2018-01-09 17:06:10:196  Service.sayHello
//
//        Process finished with exit code 0
