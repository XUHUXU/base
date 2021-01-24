/**
 * @program: base
 * @description: switch穿透
 * @author: xuhu
 * @create: 2021-01-24 12:02
 **/
public class SwitchTest {
    public static void main(String[] args) {
        /*
            switch语句注意事项：
                1.case后面的值不能重复
                2.switch小括号的数据值只能是以下数据类型：
                    基本数据类型：byte/short/char/int
                    引用数据类型：String字符串、enum枚,不能为null
                3. switch语句格式：前后顺序可以颠倒，而且break语句还可以省略。
                   匹配哪一个case就从哪一个位置向下执行，直到遇到了break或者整体结束为止,如果没有break则进行case穿透
        */
        int k = 1;
        switch (k) {
            case 1:
                System.out.println("1");
                // break; (注释break,case穿透执行)
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
                break;  // break可以省略
        }
    }
}
