class Solution {
    public int[] insertionSort(int[] nums) {
        int n=nums.length;
        for (int i = 0; i < n; i++) {
			int j = i;
			while (j > 0 && nums[j - 1] > nums[j]) {
				int temp = nums[j - 1];
				nums[j - 1] = nums[j];
				nums[j] = temp;
				j--;
			}
		}
        return nums;
    }
}


/*
Time Complexity = O(n^2) <--- (Worst case, Avg. case), O(n) <--- (Best case) 
Space Complexity = O(1)
*/
