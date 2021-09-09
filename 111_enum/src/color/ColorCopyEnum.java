package color;

public enum ColorCopyEnum {
    RED("red","红色"),
    YELLOW("yellow","黄色"),
    BLUE("blue","蓝色"),
    GREEN("green","绿色");

    private String color;
    private String description;

    ColorCopyEnum(String color, String description) {
        this.color = color;
        this.description = description;
    }
}
