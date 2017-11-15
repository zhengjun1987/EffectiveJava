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
    public Services() {
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
}
