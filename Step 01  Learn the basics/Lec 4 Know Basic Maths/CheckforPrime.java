class Solution {
    static boolean isPrime(int n) {
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        if(n>1)
            return true;
        return false;
    }
}