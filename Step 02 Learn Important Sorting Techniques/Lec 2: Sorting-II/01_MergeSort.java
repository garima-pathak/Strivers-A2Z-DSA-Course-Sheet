import java.util.ArrayList;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
		int n = arr.length;
		mergeSort(arr, 0, n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void mergeSort(int[] arr, int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		mergeSort(arr, low, mid);
		mergeSort(arr, mid + 1, high);
		merge(arr, low, mid, high);
	}

	public static void merge(int[] arr, int l, int m, int h) {
		int left=l;
		int right=m+1;
		ArrayList<Integer> temp=new ArrayList<>();
		while(left<=m && right<=h) {
			if(arr[left]<arr[right]) {
				temp.add(arr[left]);
				left++;
			}
			else {
				temp.add(arr[right]);
				right++;
			}
		}
		while(left<=m) {
			temp.add(arr[left]);
			left++;
		}
		while(right<=h) {
			temp.add(arr[right]);
			right++;
		}
		for(int i=l;i<=h;i++) {
			arr[i]=temp.get(i-l);
		}
	}
}


// Time Complexity = O(n * logn())), Space Complexity = O(n)
