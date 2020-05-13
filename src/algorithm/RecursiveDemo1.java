package algorithm;

import java.util.Scanner;

/**
 * @program: basis
 * @description: 递归案例1
 * @author: HXU3
 * @create: 2019-05-13 19:33
 **/


public class RecursiveDemo1 {
    public static void main(String[] args) {
        System.out.println("阶乘系统，请输入一个整数：");
        Scanner sc = new Scanner(System.in);
        // 初始化
        int i = 0;
        try {
            i = sc.nextInt();
            System.out.println(i + "的阶乘结果：" + factorialForI(i));
        } catch (Exception e) {
            System.out.println("输入的数不是整数！请重新使用该系统");
        } finally {
            System.out.println("感谢虎爸爸系统");
        }
    }


    /**
     * @Description: i 的阶乘
     * @Param: [i]
     * @return: long
     * @Author: HUX3
     * @Date: 2019/5/13
     */
    public static long factorialForI(long i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return factorialForI(i - 1) * i;
        }
    }
}
