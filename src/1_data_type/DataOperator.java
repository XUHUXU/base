/**
 * @program: base
 * @description: 数据运算
 * @author: xuhu
 * @create: 2021-01-10 15:34
 **/
public class DataOperator {
    /*
        运算符：进行特定操作的符号
        表达式：用运算符连接起来的式子
        四则运算：+ 、- 、* 、/
            除法运算：
                整数 / 整数 = 整数
                整数 / 浮点数 = 浮点数
                结果数据类型取决于除数
        取模（其余数）: %  (对于整数才有意义)

        自增运算符：++
        自减运算符：--
            格式：写带变量前面或后面(常量无法使用)
            使用方式：
                1.单独使用：不和其他任何操作混合，自己独立成为一个步骤
                2. 混合使用：和其他操作混合
            使用区别：
                1.单独使用的时候，前++和后++没有任何区别
                2.混合的时候：
		            A. 如果是【前++】，那么变量【立刻马上+1】，然后拿着结果进行使用。	【先加后用】
		            B. 如果是【后++】，那么首先使用变量本来的数值，【然后再让变量+1】。	【先用后加】

        注意事项： 运算当中有不同数据类型,结果会是数据范围大的那种
    */
    public static void main(String[] args) {
        {
            long l = 111;
            float f = 1.11F;
            float f1 = l + f;
            System.out.println("运算不同数据类型结果为数据范围大的(float + long --> float):" + f1);
            System.out.println("==========================");
            int a = 10;
            int b = 2;
            int c = a / b;
            double d1 = 2.0;
            double d2 = a / d1;
            System.out.println("c:" + c);
            System.out.println("d2:" + d2);
        }
        System.out.println("==========================");
        {
            int x = 10;
            int y = 20;
            int result = ++x + y--; // 11 + 20 = 31
            System.out.println("result:" + result); // 31
            System.out.println("x:" + x); // 11
            System.out.println("y:" + y); // 19
            // 30++; // 错误写法！常量不可以使用++或者--
        }
    }
}
