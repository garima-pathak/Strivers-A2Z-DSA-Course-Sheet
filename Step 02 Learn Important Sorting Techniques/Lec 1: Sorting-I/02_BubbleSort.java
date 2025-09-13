class Solution {
    public int[] bubbleSort(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++) {
			int didSwap=0;
			for(int j=0;j<n-1-i;j++) {
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					didSwap=1;
				}
			}
			if(didSwap==0)
				break;
		}
        return nums;
    }
}

/*
Time Complexity = O(n^2) <--- (Worst case, Avg. case), 
                  O(n) <--- (Best case)
Space Complexity = O(1)
*/
