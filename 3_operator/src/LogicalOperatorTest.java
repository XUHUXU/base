/**
 * @program: base
 * @description: 逻辑运算符
 * @author: xuhu
 * @create: 2021-01-24 13:30
 **/
public class LogicalOperatorTest {
    public static void main(String[] args) {
        /*
            &&, || , !
            &&短路特点：符号左边是false，右边不再运算
            ||短路特点： 符号左边是true，右边不再运算
        */
        int i = 1;
        if (i > 1 && i++ > 1) {
            System.out.println("i的值：" + i);
        } else {
            System.out.println("i的值：" + i);
        }
    }
}
