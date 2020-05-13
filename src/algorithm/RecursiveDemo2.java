package algorithm;

import java.io.File;
import java.util.Scanner;

/**
 * @program: basis
 * @description: 递归计算文件夹的大小
 * @author: HXU3
 * @create: 2019-05-13 20:14
 **/
public class RecursiveDemo2 {
    // 全局变量记录文件大小
    static long len = 0 ;

    public static void main(String[] args) {
        // 获取文件夹路径
        System.out.println("请输入文件夹绝对路径：");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        // 获取File对象
        File file = new File(path);
        // 判断文件是否存在
        if(file.exists()){
            countFile(file);
            System.out.println(len);
        }else {
            System.out.println("您好，您输入的文件不存在，谢谢使用");
        }


    }

    /**
    * @Description: 计算文件夹大小（递归运算）
    * @Param: [file]
    * @return: void
    * @Author: HUX3
    * @Date: 2019/5/14
    */
    public static void countFile(File file){
        // 判断File对象是否是文件或文件夹
        if(file.isFile()){
            len+=file.length();
        }else{
            // 获取文件夹的文件
            File[] files = file.listFiles();
            for (File fileOne : files) {
                if(fileOne.isFile()){
                    len += fileOne.length();
                }else {
                    // 文件夹是继续递归计算大小
                    countFile(fileOne);
                }
            }
        }
    }
}
