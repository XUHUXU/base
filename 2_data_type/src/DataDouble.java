import java.math.BigDecimal;

/**
 * @program: basis
 * @description: double数据精度问题
 * @author: HXU3
 * @create: 2021-02-07 15:00
 **/
public class DataDouble {
    public static void main(String[] args) {
        double businessSum = 111.10101;
        double rate = 0.065;

        // double类型数据进行计算
        double money = businessSum * rate;
        System.out.println("double类型数据进行计算:" + money);

        // double数据二进制与十进制精确转换
        double d1 = 0.0625;
        double d2 = 0.0625;
        double preciseDouble = d1 * d2;
        System.out.println("double数据二进制与十进制精确转换:" + preciseDouble);

        /*
            double精度原因:
                计算机需要将源程序翻译成二进制的机器码后才能被计算机识别,例如:2.4的二进制并非是精确的2.4，反而
            是接近二进制表示的2.399999999999999。原因是浮点数由两部分组成:指数和尾数。浮点数的二进制转换十进制
            可以较好理解这个原因。因此double类型数据不适合精确计算，因此需要使用BigDecimal。
        */


        // BigDecimal构造方法:new BigDecimal(double value)
        BigDecimal doubleBig1 = new BigDecimal(111.10101);
        BigDecimal doubleBig2 = new BigDecimal(0.065);
        BigDecimal multiply = doubleBig1.multiply(doubleBig2);
        System.out.println("new BigDecimal(double d)方法:" + multiply);


        // BigDecimal构造方法:new BigDecimal(String value)
        BigDecimal stringBig1 = new BigDecimal(Double.toString(111.10101));
        BigDecimal stringBig2 = new BigDecimal("0.065");
        BigDecimal stringMultiply = stringBig1.multiply(stringBig2);
        System.out.println("new BigDecimal(String value)方法:" + stringMultiply);

        // BigDecimal静态方法:BigDecimal.valueOf(double value)
        BigDecimal staticBig1 = BigDecimal.valueOf(111.10101);
        BigDecimal staticBig2 = BigDecimal.valueOf(0.065);
        BigDecimal staticMultiply = staticBig1.multiply(staticBig2);
        System.out.println("BigDecimal.valueOf(double value)方法:" + stringMultiply);
    }
}
