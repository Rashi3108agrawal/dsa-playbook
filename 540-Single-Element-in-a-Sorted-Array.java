class Solution {
    public int singleNonDuplicate(int[] nums) {
       int low = 0, high = nums.length - 1;

while (low < high) {
    int mid = low + (high - low) / 2;

    // Make sure mid is even, so mid and mid+1 form a pair
    if (mid % 2 == 1) mid--;

    if (nums[mid] == nums[mid + 1]) {
        // The pair is correct, so the single element is after this
        low = mid + 2;
    } else {
        // Pair is broken, single element is here or before
        high = mid;
    }
}

// At the end, low == high, pointing to the single element
return nums[low];

    }
}