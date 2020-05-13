package proxy_static;

import java.io.FileNotFoundException;


/**
 * @program: basis
 * @description: 客户端调用
 * @author: HXU3
 * @create: 2019-05-20 19:06
 **/
public class Client {
    public static void main(String[] args) throws FileNotFoundException {
        IUserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
        userManager.addUser("1","XUHU");
    }
}
