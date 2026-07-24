class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int n = nums.length;
        for(int i=1;i<n;i++){
            while(i<n && nums[i]== nums[i-1]) i++;
            if(i<n) nums[k++] = nums[i];
        }
        return k;
    }
}