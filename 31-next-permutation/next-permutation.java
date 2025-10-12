class Solution {
    // Swap function
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse function for a subarray
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // Next Permutation function
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

        // Step 1: Find the pivot (first element from right that is smaller than next)
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse the entire array
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find element just larger than nums[pivot] from right side
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // Step 4: Reverse the right half after pivot
        reverse(nums, pivot + 1, n - 1);
    }
}
