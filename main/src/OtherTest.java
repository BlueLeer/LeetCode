/**
 * @author WangLe
 * @date 2019/10/17 14:05
 * @description
 */
public class OtherTest {
    public static void main(String[] args) {
//        bitTest1();
//        bitTest2();
//        bitTest3();
//        bitTest4();

        // 二进制为: 1101
        int a = 13;
        System.out.println(sumOnes(a));
        // 二进制为: 1111
        int b = 15;
        System.out.println(sumOnes(b));
    }

    /**
     * & 与(逻辑与)运算: 两个位都是1时结果才是1,否则为0
     * <p>
     * a & 1 = a;  a & 0 = 0;
     */
    public static void bitTest1() {
        int a = 13;
        int b = 1;
        int c = 0;
        System.out.println(a & b);
        System.out.println(a & c);
    }

    /**
     * | 或运算,两位只要有一位为1则位运算以后为1
     */
    public static void bitTest2() {
        // 二进制为: 1101
        int a = 13;
        // 二进制为: 1111
        int b = 15;
        System.out.println(a | b);
    }

    /**
     * ^ 异或运算,两位相同的时候取0,不相同取1
     */
    public static void bitTest3() {
        // 二进制为: 1101
        int a = 13;
        // 二进制为: 1111
        int b = 15;

        System.out.println(a ^ b);
    }

    /**
     * ~ 按位非 : a的反码为: ~a 它的值为: ~a = -(~(~a) + 1)
     * 例如: ~1101 = -(~~1101 +1) = -(~0010+1) = -(1101+1) = -(1110) = -14
     *
     * 扩展:对于一个有符号的二进制负数:11111111 11111111 11111111 11110011 它的值为: -(~11111111 11111111 11111111 11110011+1)
     *
     */
    public static void bitTest4() {
        // 二进制为: 1101
        int a = 13;
        // 二进制为: 1111
        int b = 15;

        System.out.println(~a);
        System.out.println(~b);
    }

    /**
     * 统计一个数的二进制位中有多少个1
     */
    public static int sumOnes(int n){
        if (n< 0){
            return -1;
        }

        int count = 0;

        while(n > 0){
            int i = n & 1;
            if (i == 1){
                count++;
            }
             n >>= 1;
        }

        return count;
    }
}
