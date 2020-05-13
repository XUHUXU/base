package proxy_dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: basis
 * @description: jdk动态代理
 * @author: HXU3
 * @create: 2019-05-20 19:24
 **/
public class PeopleInvocationHandler implements InvocationHandler {
    private Object people;

    public PeopleInvocationHandler(Object people) {
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(people, args);
        System.out.println("================");
        return invoke;
    }
}
