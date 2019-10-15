import java.util.HashMap;
import java.util.Map;

/**
 * @author WangLe
 * @date 2019/7/29 10:21
 * @description
 */
public class Question_12 {
    public static String intToRoman(int num) {
        int values[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String reps[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        String res = "";
        for (int i = 0; i < 13; i++) {
            while (num >= values[i]) {
                num -= values[i];
                res += reps[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int i = 3368;
        String s = intToRoman(i);
        int i1 = romanToInt(s);
        System.out.println(i1);
    }

    public static int romanToInt(String roman) {
        Map<String, Integer> map = new HashMap<>();
        map.put("M", 1000);
        map.put("D", 500);
        map.put("C", 100);
        map.put("L", 50);
        map.put("X", 10);
        map.put("V", 5);
        map.put("I", 1);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {
            String s = String.valueOf(roman.charAt(i));
            if (i == roman.length() - 1) {
                result += map.get(s);
                return result;
            } else {
                if (map.get(s) < map.get(String.valueOf(roman.charAt(i+1)))){
                    result -= map.get(s);
                }else{
                    result += map.get(s);
                }
            }
        }

        return result;
    }
}
