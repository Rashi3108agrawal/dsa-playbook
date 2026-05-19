1class Solution {
2    public boolean canJump(int[] nums) {
3        int n = nums.length;
4        int maxreach =0;
5        for(int i=0;i<=maxreach;i++){
6            int maxjump = i+nums[i];
7            maxreach = Math.max(maxreach, maxjump);
8            if(maxreach>=n-1) return true;
9        }
10        return false;
11    }
12}