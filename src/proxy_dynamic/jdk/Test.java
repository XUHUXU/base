package proxy_dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @program: basis
 * @description: 测试
 * @author: HXU3
 * @create: 2019-05-20 19:28
 **/
public class Test {
    public static void main(String[] args) {
        People chinese = new Chinese();
        PeopleInvocationHandler invocation = new PeopleInvocationHandler(chinese);
        People proxy = (People) Proxy.newProxyInstance(chinese.getClass().getClassLoader(), chinese.getClass().getInterfaces(), invocation);
        proxy.sayHello();
    }
}
