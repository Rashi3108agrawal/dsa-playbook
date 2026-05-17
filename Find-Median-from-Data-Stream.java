1class MedianFinder {
2// maxHeap for left side to access centermost element.
3    private PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
4// minHeap for right side to access centermost element.
5    private PriorityQueue<Integer> right = new PriorityQueue<>();
6
7    public MedianFinder() {
8// Initializes MedianFinder() object.
9// Heaps Auto-Initialized.
10    }
11
12    public void addNum(int num) {
13// Inserts num to the Correct Heap & Handles Edge Cases.
14        if (right.isEmpty() && left.isEmpty())
15            left.offer(num);
16        else if (right.isEmpty())
17            if (left.peek() > num)
18                left.offer(num);
19            else
20                right.offer(num);
21        else if (right.peek() > num)
22            left.offer(num);
23        else
24            right.offer(num);
25// Moves Top Element if one Queue is Larger than the Other.
26        if (right.size() == left.size() + 2)
27            left.offer(right.poll());
28        if (right.size() + 2 == left.size())
29            right.offer(left.poll());
30    }
31
32    public double findMedian() {
33// Returns mean of top of left and right Queues if size is equal.
34        if (left.size() == right.size())
35            return (((double) right.peek() + left.peek()) / 2);
36// Returns top of the Larger Heap.
37        return right.size() > left.size() ? (double) right.peek() : (double) left.peek();
38    }
39}