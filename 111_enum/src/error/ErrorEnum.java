package error;

public enum ErrorEnum  implements IErrorMethod{
    OK(0,"成功"),
    ERROR_A(1,"错误A"),
    ERROR_B(2,"错误B");

    public int code;
    public String description;

    // 构造方法(enum的构造方法只能声明private权限或者不声明权限)
    ErrorEnum(int code,String description) {
    }

    // 普通方法
    @Override
    public int getCode(){
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    // 抽象方法
    // public abstract String getDes();

    // 静态方法
    public static void main(String args[]) {
        for (ErrorEnum s : ErrorEnum.values()) {
            System.out.println("code: " + s.getCode() + ", description: " + s.getDescription());
        }
    }
}
