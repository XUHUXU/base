package proxy_dynamic.jdk;

/**
 * @program: basis
 * @description: Jdk动态代理实现类
 * @author: HXU3
 * @create: 2019-05-20 19:22
 **/
public class Chinese implements People {
    @Override
    public void sayHello() {
        System.out.println("你好");
    }
}
