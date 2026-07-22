class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        if(nums.length ==0) return 0;
        int len =1;
        for(int num: nums){
            st.add(num);
        }
        for(int num: st){
            if(st.contains(num-1)) continue;
            int currLen =1;
            while(st.contains(num+1)){
                currLen++;
                num++;
            }
            len = Math.max(len, currLen);
        }
        return len;
    }
}