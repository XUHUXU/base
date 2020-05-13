package proxy_static;

/**
 * @program: basis
 * @description: 实现类
 * @author: HXU3
 * @create: 2019-05-20 18:57
 **/
public class UserManagerImpl implements IUserManager {
    @Override
    public void addUser(String uid, String username) {
        System.out.println("添加用户");
    }

    @Override
    public void delUser(String uid) {
        System.out.println("删除用户");
    }

    @Override
    public String findUser(String uid) {
        return "XUHU";
    }
}
