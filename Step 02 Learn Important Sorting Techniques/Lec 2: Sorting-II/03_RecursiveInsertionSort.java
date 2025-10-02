class Solution {
    public int[] insertionSort(int[] nums) {
        int n=nums.length;
        rec_insertion_sort(nums,n,0,0);
        return nums;
    }

    public void rec_insertion_sort(int[] arr, int n,int i,int j){
        if(i==n) {
			return;
		}
		if(j>0 && arr[j-1]>arr[j]) {
			int temp = arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
			rec_insertion_sort(arr,n,i,j-1);
		}
		else {
			rec_insertion_sort(arr,n,i+1,i+1);
		}
		
    }
}


/*
Time Complexity:  
- Worst case: O(n^2)
- Average case: O(n^2)
- Best case: O(n)

Space Complexity:  
- O(n) (because of recursion stack)
*/
