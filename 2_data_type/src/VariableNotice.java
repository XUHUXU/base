/**
 * @program: base
 * @description: 变量使用的注意事项
 * @author: xuhu
 * @create: 2021-08-09 23:09
 **/
public class VariableNotice {
    public static void main(String[] args) {
        /*
            1. 如果创建多个变量，那么变量名不可以重复。
            2. 对于float和long类型来说，字母后缀F和L不要丢掉。
            3. 如果使用byte或者short类型的变量，那么右侧的数据值不能超过左侧类型的范围。
            4. 没有进行赋值的变量，不能直接使用；一定要赋值之后，才能使用。
            5. 变量使用不能超过作用域的范围。
                【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止。
            6. 可以通过一个语句来创建多个变量，但是一般情况不推荐这么写。
        */

        /*
            int use;
            System.out.println(use);
        */

        // 作用域的使用
        {
            int area = 1;
            int area2 = 3;
            System.out.println(area);
        }
        int area = 2;
        System.out.println(area);
        // System.out.println(area2); 报错：找不到该变量
    }
}
