/**
 * @author WangLe
 * @date 2019/10/15 11:34
 * @description 问题描述: 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 * <p>
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,2,3]  1334533
 * 输出: 3
 */
public class Question_169 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int mode = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                count++;
                mode = nums[0];
            }else {

                if (nums[i] != mode) {
                    count--;
                }else {
                    count++;
                }

                if (count == 0 && i< nums.length-1) {
                    mode = nums[i+1];
                }
            }

        }
        return mode;
    }

    public static void main(String[] args) {
        int a[] = {2, 2, 1, 1, 1, 2, 2};
        int b[] = {8,8,7,7,7};
        int c[] = {6,6,6,7,7};
        System.out.println(majorityElement(a));
    }
}
