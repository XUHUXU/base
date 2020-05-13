package algorithm;

import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @program: basis
 * @description: 字符串切割测试
 * @author: HXU3
 * @create: 2019-09-05 16:53
 **/
public class SplitTest {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> map = new LinkedHashMap<>();
        LinkedHashMap<String, Double> mapSorted = new LinkedHashMap<>();
        map.put("c",3d);
        map.put("a",1d);
        map.put("b",2d);
        map.put("d",4d);
        map.entrySet().stream().sorted(Map.Entry.<String,Double>comparingByValue().reversed()).forEach(x-> mapSorted.put(x.getKey(),x.getValue()));
        mapSorted.entrySet().forEach( t -> System.out.println(t));
    }
}
