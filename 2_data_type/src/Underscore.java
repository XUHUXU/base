/**
 * @program: base
 * @description: 下划线“_”
 * @author: xuhu
 * @create: 2021-08-17 22:38
 **/
public class Underscore {
    public static void main(String[] args) {
        // Java7功能：下划线“_”区分数值位数
        int num = 1234567898;
        int numOfUnderscore = 123_456_789_8;
        System.out.println(num == numOfUnderscore);  // true

        String numOfUnderscoreStr = numOfUnderscore + "";
        System.out.println(numOfUnderscoreStr); // 1234567898
    }
}
