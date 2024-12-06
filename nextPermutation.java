class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;

        // Step 1: Find the first pair (nums[i-1], nums[i]) such that nums[i-1] < nums[i]
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1; // Store the index of nums[i-1]
                break;
            }
        }

        if (index == -1) {
            // Step 3: If no such pair exists, reverse the entire array
            reverse(nums, 0, n - 1);
        } else {
            // Step 2: Find the smallest number larger than nums[index] in the right subarray
            for (int j = n - 1; j > index; j--) {
                if (nums[j] > nums[index]) {
                    // Swap nums[index] with nums[j]
                    swap(nums, index, j);
                    break;
                }
            }

            // Reverse the subarray to the right of index
            reverse(nums, index + 1, n - 1);
        }
    }

    // Helper method to reverse the array in place
    public void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Helper method to swap two elements in an array
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// 31. Next Permutation
// https://leetcode.com/problems/next-permutation/
// Solved
// Medium
// Topics
// Companies
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

// For example, the next permutation of arr = [1,2,3] is [1,3,2].
// Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
// While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
// Given an array of integers nums, find the next permutation of nums.

// The replacement must be in place and use only constant extra memory.

 

// Example 1:

// Input: nums = [1,2,3]
// Output: [1,3,2]
// Example 2:

// Input: nums = [3,2,1]
// Output: [1,2,3]
// Example 3:

// Input: nums = [1,1,5]
// Output: [1,5,1]