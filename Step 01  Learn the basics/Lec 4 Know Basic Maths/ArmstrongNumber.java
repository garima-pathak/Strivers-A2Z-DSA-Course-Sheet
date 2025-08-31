class Solution {
    static boolean armstrongNumber(int n) {
        int noofdigits=(int)(Math.log10(n)+1); 
        //int noofdigits= String.valueOf(n).length();
        int sum=0,n1=n;
        while(n1!=0){
            sum+=Math.pow(n1%10,noofdigits);
            n1/=10;
        }
        if(sum==n)
            return true;
        return false;
    }
}