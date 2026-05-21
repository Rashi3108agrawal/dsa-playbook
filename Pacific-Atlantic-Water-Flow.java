1class Solution {
2    boolean[][] p;
3    boolean[][] a;
4    int[] nbs = new int[]{0, -1, 0, 1, 0};
5    List<List<Integer>> res;
6    int n, m;
7
8    public List<List<Integer>> pacificAtlantic(int[][] heights) {
9        n = heights.length;
10        m = heights[0].length;
11        res = new ArrayList<>();
12
13
14        p = new boolean[n][m];
15        a = new boolean[n][m];
16
17        for (int i = 0; i < n; i++) {
18            reach(heights, p, i, 0);
19        }
20        for (int j = 0; j < m; j++) {
21            reach(heights, p, 0, j);
22        }
23
24
25        for (int i = 0; i < n; i++) {
26            reach(heights, a, i, m - 1);
27        }
28        for (int j = 0; j < m; j++) {
29            reach(heights, a, n - 1, j);
30        }
31
32        return res;
33
34    }
35
36    void reach(int[][] h, boolean[][] arr, int x, int y) {
37        if (arr[x][y]) return;
38        
39        arr[x][y] = true;
40
41        if (p[x][y] && a[x][y]) {
42            res.add(List.of(x, y));
43        }
44
45        for (int i = 0; i < nbs.length - 1; i++) {
46            int r = x + nbs[i], c = nbs[i + 1] + y;
47            if (r >= 0 && r < n && c < m && c >= 0 && h[r][c] >= h[x][y]) {
48                reach(h, arr, r, c);
49            }
50        }
51
52    }
53}