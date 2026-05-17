1class Solution {
2    public int[] topKFrequent(int[] nums, int k) {
3
4        Map<Integer, Integer> freq = new HashMap<>();
5
6        for (int num : nums) {
7            freq.put(num, freq.getOrDefault(num, 0) + 1);
8        }
9
10        PriorityQueue<Map.Entry<Integer, Integer>> pq =
11            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
12
13        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
14            pq.add(entry);
15        }
16
17        int[] res = new int[k];
18
19        for (int i = 0; i < k; i++) {
20            res[i] = pq.poll().getKey();
21        }
22
23        return res;
24    }
25}