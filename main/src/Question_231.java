/**
 * @author WangLe
 * @date 2019/10/15 16:23
 * @description
 */
public class Question_231 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(18));
        System.out.println(isPowerOfTwo(256));
        System.out.println(isPowerOfTwo(-8));
        System.out.println(isPowerOfTwo(-16));

    }

    public static boolean isPowerOfTwo(int n) {
        if (n<=0){
            return false;
        }

        int i = n & (n - 1);
        return i == 0;
    }
}
