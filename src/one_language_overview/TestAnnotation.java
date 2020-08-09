package one_language_overview;

/**
 * @program: base
 * @description: 注释
 * @author: xuhu
 * @create: 2020-08-09 15:14
 **/
public class TestAnnotation {
    public static void main(String[] args) {
        // 单行注释
        /* 多行注释 */
        int t = testInt();
    }

    /**
     * @Description: 文档注释
     * @Param: 
     * @return: 
     * @Date: 2020/8/9
     * @throws: 
     */
    public static int testInt(){return 1;}
}
