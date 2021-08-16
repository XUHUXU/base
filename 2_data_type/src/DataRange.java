/**
 * @program: base
 * @description: 数据范围
 * @author: xuhu
 * @create: 2021-01-10 13:30
 **/
public class DataRange {
    public static void main(String[] args) {
        //  byte b2= 128;  整数默认数据类型为int,程序看到128超过byte类型数据范围，不能直接赋值。127可以直接认定为byte类型。
        byte b1= 127;

        long l1 = 111111;
        // long l2 = 11111111111; 默认数据类型为int,超过数据范围不合理,因此报错
        long l2 = 11111111111L; //  使用“l”,“L”都可以,“L”便于与“1”区分

        /*
           数据“1.2”默认类型是double类型，double类型数据类型大于float类型，因此报错
           float f = 1.2;
        */
        float f = 1.2F;

        // 强制类型转换
        int i = (int)6000000000L;
        System.out.println(i);  //  1705032704  数据溢出
    }
}
