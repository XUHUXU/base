/**
 * @program: base
 * @description: 数据类型
 * @author: xuhu
 * @create: 2021-01-10 13:50
 **/
public class DataType {
    public static void main(String[] args) {
       /*
          字符类型数据不能赋值为"\'\'"空字符
            char a = '';
          单引号之间有且只有一个字符，没有不行，有两个也不行
       */
        char a = ' ';
        System.out.println("==="+a+"===");

        /*
            boolean类型为逻辑数据类型,只能为true、flase
            boolean b2 = null; 因此报错
        */
        boolean b = true;
    }
}
