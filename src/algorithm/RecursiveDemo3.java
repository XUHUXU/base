package algorithm;

import java.util.Scanner;

/**
 * @program: basis
 * @description: 递归分解质因数
 * @author: HXU3
 * @create: 2019-05-14 10:16
 **/
public class RecursiveDemo3 {

    public static void main(String[] args) {
        System.out.println("请输正整数(非0)：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.print(i + "分解质因数：" + i + "=");
        fengJie(i);

    }

    /**
     * @Description: 递归分解质因数
     * @Param: [n] i
     * @return: void
     * @Author: HUX3
     * @Date: 2019/5/14
     */
    public static void fengJie(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + "*");
                if (n / i > 2) {
                    fengJie(n / i);
                } else {
                    System.out.println(n/2);
                }
            } else if (i == n / 2) {
                System.out.print(n);
            }
        }
        System.exit(0);

    }
}
