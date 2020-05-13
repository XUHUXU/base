package algorithm;

/*
    悲波那契数列：1 1 2 3 5 8 ... (兔子数列)
    古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，
    假如兔子都不死，问每个月的兔子总数为多少？

*/
public class Fibonacci {
    public static void main(String[] args) {
        int i = 0; // 初始化月份
        // 显示20个月兔子的数量
        for ( i=1 ;  i <= 20; i++) {
            System.out.println(i+"月兔子的数量"+f(i));
        }
    }

    public static int f(int i){
        if(i==1 || i==2){
            return 1;
        }else{
            return f(i-1)+f(i-2);
        }
    }
}
