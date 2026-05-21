1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
4        int lstend = intervals[0][1];
5        int n = intervals.length;
6        int cnt =0;
7        for(int i=1;i<n;i++){
8            if(lstend > intervals[i][0]){
9                cnt++;
10                lstend = Math.min(lstend, intervals[i][1]);
11            }
12            else lstend = intervals[i][1];
13        }
14        return cnt;
15    }
16}