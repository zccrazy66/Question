package 刷题.牛客;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-05 13:06
 **/
public class 车站建设问题 {

    public int work(int n, int[] a){
        int count = 1,len = 0;
        for(int i=1; i<a.length; i++) {
            len = a[i] - a[i-1];
            if(isPrime(len)) {
                count++;
            } else if(len % 2 == 0 || isPrime(len-2)) {
                count += 2;
            } else {
                count += 3;
            }
        }
        return count;
    }

    private boolean isPrime(int num){
        for (int i = 2; i * i <= num ; i++) {
            if (num % i ==0){
                return false;
            }
        }
        return true;
    }


}
