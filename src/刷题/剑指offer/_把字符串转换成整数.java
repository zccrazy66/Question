package 刷题.剑指offer;

/**
 将一个字符串转换成一个整数，要求不能使用字符串转换整数的库函数。
 数值为0或者字符串不是一个合法的数值则返回0
 */



public class _把字符串转换成整数 {


    public int StrToInt(String str) {

        if (str == null){
            return 0;
        }
        int flag = 0;
        int sum = 0;
        char[] a = str.toCharArray();

        if (a[0] == '-'){
            flag = 1;
        }

        for (int i = flag; i < a.length; i++) {
            if (a[i] == '+'){
                continue;
            }
            if (a[i] < 48 || a[i] >57){
                return 0;
            }
            sum = sum * 10 + a[i] -48;
        }

        return flag == 0? sum : sum*-1;
    }



}
