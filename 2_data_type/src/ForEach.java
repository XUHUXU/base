/**
 * @program: base
 * @description: Java5引入的foreach循环语句
 * @author: xuhu
 * @create: 2021-08-19 22:50
 **/
public class ForEach {
    public static void main(String[] args) {
        String[] strings = new String[]{"XH","XXS","LC","ZJB"};
        // 使用foreach循环迭代数组时，并不能改变数组元素的值
        // 使用foreach循环是不能获取数组的长度，索引
        for (var str : strings) {
            str = "HBB";
            System.out.println(str);
        }
        System.out.println(strings[0]);
        System.out.println("====================================");

        /*
        *   foreach来迭代访问数组元素时，foreach中的循环变量相当于一个临时变量，
        *   系统会把数组元素一次赋值给这个临时变量，而这个临时变量便不是数组元素，
        *   只是保存了数组元素的值。因此不能改变数组元素的值。
        * */
        String[] xArr = {"x"};
        String[][] arrArr = new String[][]{{"a"},{"b"}};
        for (var strArray : arrArr) {
            strArray = xArr;
            System.out.println(strArray);
        }
        System.out.println("====================================");
        for (String[] s : arrArr) {
            System.out.println(s);
        }
    }
}
