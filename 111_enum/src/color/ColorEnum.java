package color;

/**
 * @Description: 颜色枚举
 * @Date: 2021/8/26
 */
public enum ColorEnum {
    RED("red","红色"),
    YELLOW("yellow","黄色"),
    BLUE("blue","蓝色"),
    GREEN("green","绿色");

    private String color;
    private String description;

    ColorEnum(String color, String description) {
        this.color = color;
        this.description = description;
    }
}
