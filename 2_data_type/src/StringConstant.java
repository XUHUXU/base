/**
 * @program: base
 * @description: 字符串常量
 * @author: xuhu
 * @create: 2021-08-17 23:43
 **/
public class StringConstant {
    public static void main(String[] args) {
        // Java会确保每个字符串常量只有一个，不会产生多个副本
        String s1 = "XUHU";
        String s2 = "XUHU";
        String s3 = "XU" + "HU";  // 挡一个字符串由多个字符串常量连接而成是，本身也是字符串常量，在编译期就被解析为一个字符串常量"XUHU",也是常量池的引用
        String s4 = "XU";
        String s5 = "HU";
        String s6 = s4 + s5;
        System.out.println(s1 == s2);  // true
        System.out.println(s1 == s3);  // true
        System.out.println(s1 == s6);  // false
        System.out.println(s1.equals(s6)); // true
    }
}
