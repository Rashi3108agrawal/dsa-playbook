class MedianFinder {
// maxHeap for left side to access centermost element.
    private PriorityQueue<Integer> left = new PriorityQueue<>((a, b) -> b - a);
// minHeap for right side to access centermost element.
    private PriorityQueue<Integer> right = new PriorityQueue<>();

    public MedianFinder() {
// Initializes MedianFinder() object.
// Heaps Auto-Initialized.
    }

    public void addNum(int num) {
// Inserts num to the Correct Heap & Handles Edge Cases.
        if (right.isEmpty() && left.isEmpty())
            left.offer(num);
        else if (right.isEmpty())
            if (left.peek() > num)
                left.offer(num);
            else
                right.offer(num);
        else if (right.peek() > num)
            left.offer(num);
        else
            right.offer(num);
// Moves Top Element if one Queue is Larger than the Other.
        if (right.size() == left.size() + 2)
            left.offer(right.poll());
        if (right.size() + 2 == left.size())
            right.offer(left.poll());
    }

    public double findMedian() {
// Returns mean of top of left and right Queues if size is equal.
        if (left.size() == right.size())
            return (((double) right.peek() + left.peek()) / 2);
// Returns top of the Larger Heap.
        return right.size() > left.size() ? (double) right.peek() : (double) left.peek();
    }
}