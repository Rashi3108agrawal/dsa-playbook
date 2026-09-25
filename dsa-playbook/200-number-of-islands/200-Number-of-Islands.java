class Solution {
    public void bfs(char[][]grid, int i, int j, boolean[][]vis, int n, int m){
        vis[i][j] = true;
        int dx[] = {-1,0,1,0};
        int dy[] = {0,-1,0,1};

        for(int k=0;k<4;k++){
            int nx = i+dx[k];
            int ny = j+dy[k];

            if(nx>=0 &&ny>=0&&nx<n&& ny<m && !vis[nx][ny] && grid[nx][ny]=='1'){
                bfs(grid,nx,ny,vis,n,m);
            }
        }
    }
    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        int cnt =0;
        boolean vis[][] = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    cnt++;
                    bfs(grid,i,j,vis,n,m);
                }
            }
        }
        return cnt;
    }
}