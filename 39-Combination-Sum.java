class Solution {
    public void helper(List<List<Integer>>res,int[] candidates, int target, int n, int idx,         List<Integer> temp){
        if(target ==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(idx ==n) return;
        
        if(candidates[idx]<= target){
            temp.add(candidates[idx]);
            helper(res, candidates, target- candidates[idx], n, idx, temp);
            temp.remove(temp.size()-1);
        }
        helper(res,candidates, target, n, idx+1, temp);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = candidates.length;
        helper(res,candidates, target,n,0, new ArrayList<>());
        return res;
    }
}