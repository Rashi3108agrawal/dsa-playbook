class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        List<int[]> tmp = new ArrayList<>();
        for(int i=0;i<n;i++){
            int[] arr = new int[2];
            arr[0] = intervals[i][0];
            while(i<n-1 && intervals[i][1]>= intervals[i+1][0]){
                intervals[i+1][1] = Math.max(intervals[i+1][1], intervals[i][1]);
                i++;
            }
            arr[1] = intervals[i][1];
            tmp.add(arr);
        }
        return tmp.toArray(new int[0][]);
    }
}