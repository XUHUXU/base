import java.math.BigDecimal;

/**
 * @program: basis
 * @description: double数据科学计数法问题
 * @author: HXU3
 * @create: 2021-04-15 16:24
 **/
public class DataDoubleScientificNotation {
    public static void main(String[] args) {
        double d = 1.35E10;
        String sDouble = d +"";
        BigDecimal dBig = BigDecimal.valueOf(d);
        String s = dBig.toPlainString();
        System.out.println(s);
        System.out.println(sDouble);
    }
}
