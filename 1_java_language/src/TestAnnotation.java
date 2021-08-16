/**
 * @program: base
 * @description: ×¢ÊÍ
 * @author: xuhu
 * @create: 2020-08-09 15:14
 **/
public class TestAnnotation {
    public static void main(String[] args) {
        // µ¥ĞĞ×¢ÊÍ
        /* ¶àĞĞ×¢ÊÍ */
        int t = testInt();
        System.out.println(t);

        /**
         *  ÎÄµµ×¢ÊÍ£¬JavaDoc¹¤¾ß²âÊÔ
         */
        int doc = 123;
    }

    /**
     * @Description: ÎÄµµ×¢ÊÍ²âÊÔpublicĞŞÊÎ·û
     * @Param:
     * @return: int ÊıÖµ
     * @Date: 2020/8/9
     * @throws:
     */
    public static int testInt() {
        return 1;
    }

    /**
     * @Description: ÎÄµµ×¢ÊÍ²âÊÔprotectedĞŞÊÎ·û
     * @Param:
     * @return: int ÊıÖµ
     * @Date: 2021/8/16
     * @throws:
     */
    protected int testProtectde() {
        return 1;
    }

    /**
     * @Description: ÎÄµµ×¢ÊÍ²âÊÔprivateĞŞÊÎ·û
     * @Param:
     * @return:
     * @Date: 2021/8/16
     * @throws:
     */
    private String testPrivate(int n) {
        return "²âÊÔÎÄµµ×¢ÊÍ";
    }
}
