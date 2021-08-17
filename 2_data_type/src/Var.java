/**
 * @program: base
 * @description: var定义变量
 * @author: xuhu
 * @create: 2021-08-17 22:52
 **/
public class Var {
    public static void main(String[] args) {
        /*
        *   Java10开始支持使用var定义局部变量，var相当于一个动态类型，
        *   使用var定义的局部变量的类型由编译器自动推断——定义变量是分配了什么类型的初始值，那就是什么类型。
        *   因此var定义局部变量时，必须在定义变量的同事指定初始值，否则编译器无法推断。
        */
        var str = "sss";
        if (str instanceof String){
            System.out.println("变量str是字符串");
        }

        var num = 111;
        int[] intArray = new int[1];
        intArray[0] = num;
        System.out.println(intArray[0]);

        // var a ;  Cannot infer type:'var' on variable without initializer (无法推断类型：没有初始化程序的变量上的“var”)
    }
}
