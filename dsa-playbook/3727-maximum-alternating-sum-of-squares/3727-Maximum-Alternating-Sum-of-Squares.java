
import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<0) nums[i]*=-1;        
        }
        Arrays.sort(nums);

        int r = 0;
        int l = n - 1;
        long sum = 0;

        while (l > r) {
            long num1 = (long) nums[l] * nums[l];
            long num2 = (long) nums[r] * nums[r];

            sum += num1 - num2;
            l--;
            r++;
        }

        if (l == r) {
            sum += (long) nums[l] * nums[l];
        }

        return sum;
    }
}
