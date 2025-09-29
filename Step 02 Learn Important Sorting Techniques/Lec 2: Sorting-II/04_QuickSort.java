public class Quick_Sort {

	public static void main(String[] args) {
		int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
		int n = arr.length;
		quickSort(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void quickSort(int[] arr,int low,int high) {
		if(low>=high)return;
		int pivot=qFunc(arr,low,high);
		quickSort(arr,low,pivot-1);
		quickSort(arr,pivot+1,high);
	}

	public static int qFunc(int[] arr,int low,int high) {
		int pivot=arr[low];
		int i=low,j=high;
		while(i<j) {
			while(arr[i]<=pivot && i<high) {
				i++;
			}
			while(arr[j]>pivot && j>=low) {
				j--;
			}
			if(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[j];
		arr[j]=arr[low];
		arr[low]=temp;
		return j;
	}
}


// Time Complexity = O(n * logn), Space Complexity = O(1)
