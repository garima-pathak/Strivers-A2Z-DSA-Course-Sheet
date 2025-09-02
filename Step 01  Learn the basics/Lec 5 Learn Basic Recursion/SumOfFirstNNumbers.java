// Question Link: https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1

class Solution {
    int sumOfSeries(int n) {
        int sum=0;
        if(n==0){
            return 0;
        }
        return sum+=n*n*n+sumOfSeries(n-1);
    }
}