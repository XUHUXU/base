import java.util.ArrayList;

/**
 * @program: base
 * @description: list集合方法测试
 * @author: xuhu
 * @create: 2021-09-07 15:29
 **/
public class ListMethodTest {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("XUHU1");
        strList.add("XUHU2");
        //  clear()方法
        System.out.println("list的大小：" + strList.size());
        strList.clear();
        System.out.println("list的大小(调用clear()方法)：" + strList.size());
    }
}
