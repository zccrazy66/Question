package 题.剑指offer;

/**
 * 题目： 给定一个double类型的浮点数 base 和 int 类型的整数 exponent。
 *       求 base 的 exponent 次方。
 *       保证 base 和 exponent不同时为0
 */


public class _14数值的整数次方 {

    public double Power(double base, int exponent) {

        // 考虑所有情况

        if(base == 0.0){
            return 0;
        }


        if (exponent == 0){
            return 1;
        }

        double power = 0;

        if (exponent < 0){
            power =  Math.pow(base, 1 / Math.abs(exponent));
            return 1.0/power;
        }

        power = Math.pow(base, exponent);
        return power;

    }

}
