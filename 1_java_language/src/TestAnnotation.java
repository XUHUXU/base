/**
 * @program: base
 * @description: ע��
 * @author: xuhu
 * @create: 2020-08-09 15:14
 **/
public class TestAnnotation {
    public static void main(String[] args) {
        // ����ע��
        /* ����ע�� */
        int t = testInt();
        System.out.println(t);

        /**
         *  �ĵ�ע�ͣ�JavaDoc���߲���
         */
        int doc = 123;
    }

    /**
     * @Description: �ĵ�ע�Ͳ���public���η�
     * @Param:
     * @return: int ��ֵ
     * @Date: 2020/8/9
     * @throws:
     */
    public static int testInt() {
        return 1;
    }

    /**
     * @Description: �ĵ�ע�Ͳ���protected���η�
     * @Param:
     * @return: int ��ֵ
     * @Date: 2021/8/16
     * @throws:
     */
    protected int testProtectde() {
        return 1;
    }

    /**
     * @Description: �ĵ�ע�Ͳ���private���η�
     * @Param:
     * @return:
     * @Date: 2021/8/16
     * @throws:
     */
    private String testPrivate(int n) {
        return "�����ĵ�ע��";
    }
}
