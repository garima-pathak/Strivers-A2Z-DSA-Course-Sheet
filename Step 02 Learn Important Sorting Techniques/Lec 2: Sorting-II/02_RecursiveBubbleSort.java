class Solution {
    public int[] bubbleSort(int[] nums) {
        int n=nums.length;
        rec_bubble_sort(nums,n,0,0,0);
        return nums;
    }

    public void rec_bubble_sort(int[] arr, int n,int i,int j,int didSwap){
        if(i==n-1) {
			return;
		}
		
		if(j<n-1-i) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				didSwap=1;
			}
			rec_bubble_sort(arr,n,i,j+1,didSwap);
		}
		else {
			rec_bubble_sort(arr,n,i+1,0,didSwap);
		}
		if(didSwap==0)
			return;
    }
}


/*
Time Complexity:  
- Best Case: O(n)

- Average Case: O(n^2)

- Worst Case: O(n^2)

Space Complexity:  
- O(n) (recursion stack)
*/
