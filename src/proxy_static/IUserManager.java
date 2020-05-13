package proxy_static;

public interface IUserManager {
    void addUser(String uid,String username);

    void delUser(String uid);

    String findUser(String uid);
}
