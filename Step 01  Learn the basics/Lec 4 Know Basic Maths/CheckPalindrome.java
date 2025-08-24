class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int n1=x;
        while(x!=0){
            rev=rev*10+x%10;
            x/=10;
        }
        if(n1>=0)
            return n1==rev?true:false;
        return false;
    }
}