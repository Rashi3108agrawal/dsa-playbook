class Solution {
    public boolean isPalin(String s){
        int n = s.length();
        int i=0;
        int j= n-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void helper(String s,int idx, List<List<String>> res, List<String> temp){
        int n = s.length();
        if(idx ==n){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i= idx; i<n;i++){
            String sub = s.substring(idx,i+1);
            if(isPalin(sub)){
                temp.add(sub);
                helper(s, i+1, res,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> res = new ArrayList<>();
        helper(s,0,res, new ArrayList<>());
        return res;
    }
}