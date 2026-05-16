class Solution {
    public int maxProduct(int[] nums) {
        int prod =1;
        int res =Integer.MIN_VALUE;
        int n = nums.length;
        for(int num: nums){
            prod*= num;
            res = Math.max(res, prod);
            if(num==0) prod =1;
        }
        prod =1;
        for(int i=n-1;i>=0;i--){
            prod*= nums[i];
            res = Math.max(res, prod);
            if(nums[i]==0) prod =1;
        }
        return res;
    }
}