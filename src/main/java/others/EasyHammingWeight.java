package others;

/**
 * Number of 1 Bits
 * <p>
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 */
public class EasyHammingWeight {
    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n&=(n-1);
            count++;
        }
        return count;
    }
}
