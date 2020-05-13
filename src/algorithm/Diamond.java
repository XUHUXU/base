package algorithm;

import java.util.Scanner;

/**
 * @program: basis
 * @description: 菱形
 * @author: HXU3
 * @create: 2019-05-17 09:55
 **/
public class Diamond {
    public static void main(String[] args) {
        System.out.println("请输入菱形的大小(奇数)：");
        Scanner sc = new Scanner(System.in);
        paintDiamond(sc.nextInt());
    }

    public static void paintDiamond(int n){
        for (int i=0; i < n; i++) {
            if(i<n/2){
                for(int m=0; m<n/2-i;m++){
                    System.out.print(" ");
                }
                for (int j =0; j<=i;j++){

                    System.out.print("* ");
                }
            }else {
                for(int k=0;k<i-n/2;k++){
                    System.out.print(" ");
                }
                for (int j = 0; j<n-i;j++){
                    System.out.print("* ");
                }
            }
            // 换行
            System.out.println();
        }
    }
}
