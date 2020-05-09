package firstHundred;

/**
 * 实现 int sqrt(int x) 函数。
 * <p>
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * <p>
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 *
 * @author sunjiantao
 * @date 2020-05-09
 */
public class Num69 {
    public static void main(String[] args) {
        Num69 num69 = new Num69();
        System.out.println(num69.mySqrt(2147395599));
    }

    /**
     * 思路：使用折半查找，然后相除比较。
     *
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        if (x == 0 || x == 1) {
            return x;
        }
        while (left < right) {
            int mid = (left + right) / 2;
            if (x / mid == mid) {
                return mid;
            } else if (x / mid > mid) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left - 1;
    }
}
