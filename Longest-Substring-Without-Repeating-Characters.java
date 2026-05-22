1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int st =0;
5        int end= 0;
6        int longest = 0;
7        Set<Character> set = new HashSet<>();
8        while(end<n){
9            char c = s.charAt(end);
10            while(set.contains(c)){
11                char prev = s.charAt(st);
12                set.remove(prev);
13                st++;
14            }
15            set.add(c);
16            end++;
17            longest = Math.max(longest, end-st);
18        }
19        return longest;
20    }
21}