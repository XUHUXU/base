/**
 * @program: base
 * @description: 数据类型转换
 * @author: xuhu
 * @create: 2021-01-10 14:21
 **/
public class DataChange {
    public static void main(String[] args) {
    /*
        数据类型转换：
            1.自动类型转换（隐式）
                代码不需要进行特殊处理,自动完成;
                数据范围从小转换为大
            2.强制类型转换
                代码需要特殊处理，不能自动完成;
                范围小数据类型的变量名 = (范围小的类型) 原本范围大的数据
              注意事项:
                2.1 强制类型一般不推荐使用,会数据溢出,精度丢失
                2.2 byte/short/char这三种类型都可以发生数学运算，例如加法“+”.
	            2.3 byte/short/char这三种类型在运算的时候，都会被首先提升成为int类型，然后再计算
	            2.4 boolean类型不能发生数据类型转换
    */
        // 自动类型转换
        {
            short s = 23;      // 这种情况下“23”不会被默认为int类型
            int i = s;         // short -> int
            long l = 111;      // int -> long
            double d = 1.111F; // float -> double
            float f = 30L;     // long -> float
            System.out.println(f);

            // 计算时自动提升为int类型
            int i1 = i + s ; // int + short --> int + int --> int
            long l1 = s + i + l;  // long + short + int --> int + int + long --> long
            char c = 'X';
            int i2 = c + 1;  // char + int --> int + int --> int
            char c1  = (char) (c + 2);   // 强制类型转换
            System.out.println("变量c1:"+c1);
            // 表达式的自动类型提升需要表达式中有变量,系统在编译的时候发现两个常量相加最后一定为常量,常量是有固定大小内存存储,不存在类型提升
            char c2 = 65 + 10;
            System.out.println("变量c2:"+c2);
        }

        System.out.println("======================");
        // 强制类型转换
        {
            int i1 = (int) 100L;
            int i2 = (int) 3.99; // 数据精度丢失,小数部分全部被舍弃
            char c = '徐';
            System.out.println("字符型c:"+(c+1));
            // 注意: 右侧数值大小不能超过左侧类型范围
            byte b1 = 100;
            byte b2 = 120;
            byte b3 = (byte) (b1+b2);
            System.out.println("数据溢出b3:"+b3); // 打印数值不为220
        }
    }
}
