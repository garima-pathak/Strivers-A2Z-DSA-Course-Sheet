// Question Link: https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=print-1-to-n-without-using-loops

class Solution {
    public void printNos(int n) {
        if(n==0)
            return;
        printNos(n-1);
        System.out.print(n+" ");
    }
}