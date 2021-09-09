package color;

/**
 * @program: base
 * @description: 测试颜色枚举
 * @author: xuhu
 * @create: 2021-08-26 10:16
 **/
public class UserColor {
    public static void main(String[] args) {
        ColorEnum red = ColorEnum.RED;
        ColorEnum blue = ColorEnum.BLUE;
        ColorCopyEnum red2 = ColorCopyEnum.RED;

        // valueOf
        ColorEnum red1 = ColorEnum.valueOf("RED");

        // values(): 返回enum实例数组,数组元素严格保持在enum中声明的顺序
        ColorEnum[] values = ColorEnum.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println("索引:" +i + " 值:" + values[i]);
        }
        System.out.println("===============================================");

        // name(): 返回实例名
        String redName = red.name();
        System.out.println("实例名：" + redName);
        System.out.println("===============================================");


        // ordinal(): 返回实例的声明的次序
        int ordinal = red.ordinal();
        System.out.println("RED的次序：" + ordinal);
        System.out.println("===============================================");

        // getDeclaringClass(): 返回实例的所属类型
        Class<ColorEnum> declaringClass = red.getDeclaringClass();
        System.out.println(declaringClass);
        System.out.println("===============================================");


        // equals(): 判断是否是同一个对象,也可以使用' == ' 来比较实例
        System.out.println("red.equals(red2): " +  red.equals(red2));
        System.out.println("red.equals(blue): " +  red.equals(blue));
        System.out.println("red.equals(red2): " + (red == blue));
    }
}
