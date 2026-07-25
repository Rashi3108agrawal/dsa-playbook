class Solution {
    public void helper(int[] cand, int target, List<List<Integer>> res, List<Integer> temp, int idx) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = idx; i < cand.length; i++) {
            if (i > idx && cand[i] == cand[i - 1]) continue;

            if (cand[i] > target) break;

            temp.add(cand[i]);
            helper(cand, target - cand[i], res, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, res, new ArrayList<>(), 0);
        return res;
    }
}
