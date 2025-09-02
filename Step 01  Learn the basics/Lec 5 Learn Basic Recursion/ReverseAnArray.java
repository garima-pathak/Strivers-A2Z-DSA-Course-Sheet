// Question Link: https://www.geeksforgeeks.org/program-to-reverse-an-array/

class Solution {
    public void reverseArray(int arr[]) {
        
        int n=arr.length;
        int[] arrNew=new int[n];
        tempRev(arr,arrNew,n-1,0);
        for (int i = 0; i < n; i++) {
            arr[i] = arrNew[i];
        }
    }
    
    public void tempRev(int[] arr,int[] arrNew,int len,int idx){
        if(idx==arr.length){
            return;
        }
        arrNew[idx]=arr[len];
        tempRev(arr,arrNew,len-1,idx+1);
    }
}