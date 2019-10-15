/**
 * @author WangLe
 * @date 2019/10/15 15:06
 * @description 问题描述:给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 *
 * 示例 1:
 *
 * 输入: [3,0,1]
 * 输出: 2
 *
 * 分析:等差数组
 *
 */
public class Question_268 {
    public static int missingNumber(int[] nums) {
        int nn = nums.length;
        int exceptSum = nn*(nn+1)/2;

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        return exceptSum-sum;
    }

    public static void main(String[] args) {
        int arr[]= {9,6,4,2,3,5,7,0,1};
        int i = missingNumber(arr);
        System.out.println(i);
    }
}
