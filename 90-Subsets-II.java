class Solution {

    public void helper(int[] nums,List<Integer> temp, List<List<Integer>> res, int idx){
        if(idx == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[idx]);
        helper(nums, temp, res, idx+1);
        temp.remove(temp.size()-1);

        while(idx+1<nums.length && nums[idx]== nums[idx+1]) idx++;
        helper(nums, temp, res, idx+1);
        return;
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums, temp, res,0);
        return res;
    }
}