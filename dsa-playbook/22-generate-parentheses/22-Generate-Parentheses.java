class Solution {
    public void helper(int n, List<String> res, int idx, int left, int right, StringBuilder temp){
        if(idx == 2*n){
            res.add(temp.toString());
            return;
        }
        if(left<n){
            temp.append("(");
            helper(n, res, idx+1, left+1, right, temp);
            temp.deleteCharAt(temp.length()-1);
        }
        if(right<left){
            temp.append(")");
            helper(n, res, idx+1, left, right+1, temp);
            temp.deleteCharAt(temp.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper(n,res,0,0,0, new StringBuilder());
        return res;
    }
}