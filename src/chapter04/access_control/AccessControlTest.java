package chapter04.access_control;


/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/2/1 10:54
 */
class AccessControlTest {
    public static void main(String[] args) {
        System.out.println(com.sun.xml.internal.ws.util.Constants.LoggingDomain);//com.sun.xml.internal.ws
        //chapter04.access_control中的类无法访问chapter04.Constants
    }
}
