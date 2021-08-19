/**
 * @program: base
 * @description: for循环的多个初始化语句
 * @author: xuhu
 * @create: 2021-08-19 21:09
 **/
public class InitOfFor {
    public static void main(String[] args) {
        // for循环的多个初始化语句
        for (int i = 1, j = 10; i < j; i++) {
            j--;
            System.out.println("循环次数：" + i);
        }
    }
}
