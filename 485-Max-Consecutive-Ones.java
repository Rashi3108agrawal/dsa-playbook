class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cnt =0;
        int max = 0;
        for(int num: nums){
            if(num ==1){
                cnt++;
                max = Math.max(max, cnt);
            }else{
                //max = Math.max(max, cnt);
                cnt =0;
            }
        }
        return max;
    }
}