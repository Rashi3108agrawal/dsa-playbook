1class Solution {
2    public void setZeroes(int[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        boolean row[] = new boolean[n];
6        boolean col[] = new boolean[m];
7        for(int i=0;i<n;i++){
8            for(int j=0;j<m;j++){
9                if(matrix[i][j] ==0){
10                    row[i]= true;
11                    col[j] = true;
12                }
13            }
14        }
15        for(int i=0;i<n;i++){
16            if(row[i]){
17                for(int j=0;j<m;j++){
18                    matrix[i][j] = 0;
19                }
20            }
21        }
22        for(int i=0;i<m;i++){
23            if(col[i]){
24                for(int j=0;j<n;j++){
25                    matrix[j][i] = 0;
26                }
27            }
28        }
29    }
30}