package 刷题.leetcode.搜索;

/**
 * @program: Question
 * @description
 * @author: zc
 * @create: 2020-07-06 11:07
 **/
public class 图像渲染733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || image[0] == null){
            return image;
        }
        int origin = image[sr][sc];
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        image[sr][sc] = newColor;
        if(origin == newColor) return image;
        for (int i = 0; i < 4; i++) {
            int x = sr + dx[i];
            int y = sc + dy[i];
            if (x>=0 && x<image.length && y>=0 && y<image[0].length && image[x][y] == origin){
                floodFill(image,x,y,newColor);
            }
        }
        
        return image;
    }

}
