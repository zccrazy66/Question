package 题.剑指offer;


/**
 *  题目：
 *  在一个二维数组中（每个一维数组的长度相同），
 *  每一行都按照从左到右递增的顺序排序，
 *  每一列都按照从上到下递增的顺序排序。
 *
 *  请完成一个函数，输入这样的一个二维数组和一个整数，
 *  判断数组中是否含有该整数。
 *
 */


public class _2二维数组中的查找 {


//      思路：从左下角开始比较，由于矩阵往右、往下递增，所以小就向上取，大就向右取


        public boolean Find(int target, int [][] array){

            if (array == null){
                return false;
            }

            int length = array.length;
            int width = 0;

            while (length>=0 && width < array[0].length){

                if (array[length][width] < target){
                    width ++;
                }else if (array[length][width] > target){
                    length --;
                }else {
                    return true;
                }
            }
            return false;

        }

//        先用暴力法试一试。。。。
//        public boolean Find(int target, int [][] array) {
//            if(array == null){
//                return false;
//            }
//
//            for (int i = 0; i < array.length; i++) {
//                for (int j = 0; j < array[0].length; j++) {
//                    if (array[i][j] == target)
//                    {
//                        return true;
//                    }
//                }
//            }
//            return false;
//        }


}
