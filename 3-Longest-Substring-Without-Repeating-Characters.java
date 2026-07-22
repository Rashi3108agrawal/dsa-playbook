class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int st =0;
        int end= 0;
        int longest = 0;
        Set<Character> set = new HashSet<>();
        while(end<n){
            char c = s.charAt(end);
            while(set.contains(c)){
                char prev = s.charAt(st);
                set.remove(prev);
                st++;
            }
            set.add(c);
            end++;
            longest = Math.max(longest, end-st);
        }
        return longest;
    }
}