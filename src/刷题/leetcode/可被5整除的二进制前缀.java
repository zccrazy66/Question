package 刷题.leetcode;

import java.util.ArrayList;
import java.util.List;

public class 可被5整除的二进制前缀 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> list = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            num = (num*2 + A[i])%10;
            if (num%5 == 0){
                list.add(true);
            }else {
                list.add(false);
            }
        }
        return list;
    }
}
