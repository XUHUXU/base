/**
 * @program: base
 * @description: 垃圾回收机制
 * @author: xuhu
 * @create: 2020-08-04 22:45
 **/
public class TestGc {
    public static void main(String[] args) {
        /*
        *   建议系统进行垃圾回收，但这种调用只是建议，不能精确控制垃圾回收机制的执行
        */
        System.gc();
    }
}
