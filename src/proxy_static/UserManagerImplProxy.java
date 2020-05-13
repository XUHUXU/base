package proxy_static;

/**
 * @program: basis
 * @description: 代理实现类
 * @author: HXU3
 * @create: 2019-05-20 18:59
 **/
public class UserManagerImplProxy implements IUserManager {
    //目标对象
    private IUserManager userManager;

    public UserManagerImplProxy(IUserManager userManager) {
        this.userManager = userManager;
    }

    @Override
    public void addUser(String uid, String username) {
        try {
            System.out.println("打印日志");
            userManager.addUser(uid,username);
            System.out.println("添加用户成功");
        } catch (Exception e) {
            System.out.println("程序错误");
        }
    }

    @Override
    public void delUser(String uid) {
        userManager.delUser(uid);
    }

    @Override
    public String findUser(String uid) {
        userManager.findUser(uid);
        return "XUHU";
    }
}
