class Solution {

    public void helper(int[] nums, boolean[] vis,
                       List<List<Integer>> res, List<Integer> temp) {

        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {

            if (vis[i]) continue;

            vis[i] = true;
            temp.add(nums[i]);

            helper(nums, vis, res, temp);

            temp.remove(temp.size() - 1);
            vis[i] = false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        helper(nums, new boolean[nums.length], res, new ArrayList<>());
        return res;
    }
}