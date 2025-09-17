class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // agar k bada ho

        // 1. Reverse entire array
        reverse(nums, 0, n - 1);

        // 2. Reverse first k elements
        reverse(nums, 0, k - 1);

        // 3. Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}