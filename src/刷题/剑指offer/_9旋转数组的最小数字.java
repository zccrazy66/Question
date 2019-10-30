package 刷题.剑指offer;

/**
 * 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 *      输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如：{3,4,5,1,2}  为  {1,2,3,4,5}的旋转  该数组的最小值为1。
 *
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */

public class _9旋转数组的最小数字 {

    public int minNumberInRotateArray(int [] array) {
        if (array == null){
            return 0;
        }

        // 思路： 使用二分法来解决问题
        int low = 0;
        int high = array.length - 1;


        while (low < high){
            int mid = low + (high - low) / 2;
            if(array[mid] > array[high]){
                low = mid + 1;
            }else if(array[mid] == array[high]){
                high = high - 1;
            }else{
                high = mid;
            }
        }
        return array[low];





//        暴力法不可取 O(n);  这样子是不行的
//        int min = array[array.length - 1];
//        for (int i = array.length - 1; i > 0; i--) {
//            if (array[i] < min){
//                min = array[i];
//            }
//        }
//        return min;
    }


//    ThreadPoolExecutor

}
