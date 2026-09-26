class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        boolean [] dp = new boolean [n+1];
        Set<String> st = new HashSet<>();
        for(String word: wordDict){
            st.add(word);
        }
        dp[0]= true;
        for(int i=0;i<=n;i++){
            if(!dp[i]) continue;
            for(int j=i+1;j<=n;j++){
                String temp = s.substring(i,j);
                if(st.contains(temp)){
                    dp[j] = true;
                }
            }
        }
        return dp[n];
    }
}