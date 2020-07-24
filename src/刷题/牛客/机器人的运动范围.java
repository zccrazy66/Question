package 刷题.牛客;

public class 机器人的运动范围 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0,0,k,visited,m,n);
    }

    private static int dfs(int i, int j, int k, boolean[][] visited,int m,int n){
        if (i<0||i>=m||j<0||j>=n|| count(i,j)>k || visited[i][j]){
            return 0;
        }
        visited[i][j] = true;
        return dfs(i+1,j,k,visited,m,n)+dfs(i-1,j,k,visited,m,n)+dfs(i,j+1,k,visited,m,n)+dfs(i,j-1,k,visited,m,n)+1;
    }

    private static int count(int i, int j){
        return i/10 + i%10 + j/10 + j%10;
    }
}
