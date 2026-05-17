1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        List<Integer> res = new ArrayList<>();
4        int m = matrix.length;
5        int n = matrix[0].length;
6        int top =0;
7        int bottom = m-1;
8        int left = 0;
9        int right = n-1;
10        while(top<=bottom && left<=right){
11            for(int i= left;i<= right;i++){
12                res.add(matrix[top][i]);
13            }
14            top++;
15            for(int i = top;i<= bottom;i++){
16                res.add(matrix[i][right]);
17            }
18            right--;
19
20            if(top<=bottom){
21                for(int i= right;i>= left;i--){
22                    res.add(matrix[bottom][i]);
23                }
24                bottom--;
25            }
26            if(left<=right){
27                for(int i= bottom;i>= top;i--){
28                    res.add(matrix[i][left]);
29                }
30                left++;
31            }
32        }
33        return res;
34    }
35}