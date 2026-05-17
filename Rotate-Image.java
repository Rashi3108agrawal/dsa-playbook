1class Solution {
2    public void rotate(int[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5        int top =0;
6        int bottom = n-1;
7        while(top<bottom){
8            for(int i=0;i<m;i++){
9                int temp = matrix[top][i];
10                matrix[top][i] = matrix[bottom][i];
11                matrix[bottom][i] = temp;
12            }
13            top++;
14            bottom--;
15        }
16        for(int i=0;i<n;i++){
17            for(int j=0;j<n;j++){
18                if(i<j){
19                    int temp = matrix[i][j];
20                    matrix[i][j] = matrix[j][i];
21                    matrix[j][i] = temp;
22                }
23             }
24        }
25    }
26}