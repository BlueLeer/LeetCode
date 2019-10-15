import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author WangLe
 * @date 2019/10/15 13:49
 * @description 问题描述:给定一个大小为 n 的数组，找出其中所有出现超过 [n/3] 次的元素。
 * <p>
 * 说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]
 * 输出: [3]
 * 示例 2:
 * <p>
 * 输入: [1,1,1,3,3,2,2,2]
 * 输出: [1,2]
 * <p>
 * 分析:超过 n/3 最多只有2个数 使用摩尔投票法
 */
public class Question_229 {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 1, 2, 3, 2, 1, 2};
//        int[] arr2 = {0,-1,2,-1};
//        int[] arr3 = {10,9,9,9,10};
//        List<Integer> integers = majorityElement(arr3);
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

        a();
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int countA = 0;
        int countB = 0;
        // 候选人a
        int a = Integer.MIN_VALUE;
        // 候选人b
        int b = Integer.MIN_VALUE;

        for (int num : nums) {
            if (a == num) {
                countA++;
                continue;
            }

            if (b == num) {
                countB++;
                continue;
            }
            if (countA == 0) {
                a = num;
                countA++;
                continue;
            }
            if (countB == 0) {
                b = num;
                countB++;
                continue;
            }

            countA--;
            countB--;

        }

        countA = 0;
        countB = 0;
        // 上面只是找出了两个候选人,有可能不满足题设条件(数字出现次数大于 n/3 )
        for (int num : nums) {
            if (num == a) {
                countA++;
            }else if (num == b) {
                countB++;
            }
        }
        if (countA > nums.length / 3) {
            res.add(a);
        }
        if (countB > nums.length / 3) {
            res.add(b);
        }
        return res;
    }

    public static void a(){
        int a = 0;
        int b = 100;
        System.out.println(a^b);
    }
}
