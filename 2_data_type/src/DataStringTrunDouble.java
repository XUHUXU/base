import java.util.*;

/**
 * @program: basis
 * @description: String转换为double类型数据
 * @author: HXU3
 * @create: 2021-04-23 11:29
 **/
public class DataStringTrunDouble {
    public static void main(String[] args) {
       /* String s = "0.0";
        double v = Double.parseDouble(s);
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.size());
        HashMap<String, List<Integer>> hMap = new HashMap<>();
        hMap.put("01",new ArrayList<Integer>());
        hMap.put("",new ArrayList<Integer>());
        List<Integer> integers = hMap.get("");
        integers.add(1);
        integers.add(2);
        String substring = "2021/05/20".substring(0, 7);
        System.out.println(substring);
        List<Integer> integers1 = hMap.get("");

        System.out.println(integers1.toArray());*/

       /* Calendar gregorianCalendar = new GregorianCalendar();
        Date time = gregorianCalendar.getTime();
        System.out.println(time);
        gregorianCalendar.setTime(new Date("2021/05/20"));
        int weekYear = gregorianCalendar.getWeekYear();
        System.out.println(weekYear);
        int i = gregorianCalendar.get(1);
        int j = gregorianCalendar.get(2);
        int k = gregorianCalendar.get(3);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(1/3);*/


       int cc = 1;
       int count = 0;
       int mouth = 8;
       int year = 2021;
        ArrayList<String> strings
                = new ArrayList<>();
        if(true){
           String[] array = new String[]{"/03","/06","/09","/12"};
           count= 4;
           int m = mouth/3;
           for (int i = (m - 1); i >= 0; i--) {
               strings.add(year+array[i]);
           }
           for(int i = array.length-1; i> array.length -1 - (cc+count-m);i--){
               strings.add(year-1+array[i]);
           }
       }

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }

    }
}
