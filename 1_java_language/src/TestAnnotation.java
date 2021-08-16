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
        System.out.println(t);

        /**
         *  文档注释，JavaDoc工具测试
         */
        int doc = 123;
    }

    /**
     * @Description: 文档注释测试public修饰符
     * @Param:
     * @return: int 数值
     * @Date: 2020/8/9
     * @throws:
     */
    public static int testInt() {
        return 1;
    }

    /**
     * @Description: 文档注释测试protected修饰符
     * @Param:
     * @return: int 数值
     * @Date: 2021/8/16
     * @throws:
     */
    protected int testProtectde() {
        return 1;
    }

    /**
     * @Description: 文档注释测试private修饰符
     * @Param:
     * @return:
     * @Date: 2021/8/16
     * @throws:
     */
    private String testPrivate(int n) {
        return "测试文档注释";
    }
}
