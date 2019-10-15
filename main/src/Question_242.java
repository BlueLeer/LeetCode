import java.util.stream.IntStream;

/**
 * @author WangLe
 * @date 2019/10/15 11:22
 * @description 问题描述:给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 */
public class Question_242 {
    public static boolean isAnagram(String s, String t) {
        int[] staS = new int['z' - 'a' + 1];
        int[] staT = new int['z' - 'a' + 1];
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();

        for (char c : charsS) {
            staS[c - 'a'] += 1;
        }

        for (char c : charsT) {
            staT[c - 'a'] += 1;
        }

        for (int i = 0; i < 26; i++) {
            if (staS[i] != staT[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "helloabc";
        String s2 = "ollhebac";
        System.out.println(isAnagram(s1, s2));
    }
}
