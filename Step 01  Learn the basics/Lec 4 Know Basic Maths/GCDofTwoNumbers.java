class Solution {
    public static int gcd(int a, int b) {
        int divi=b,divisor=a;
        while(divisor!=0){
            int rem=divi%divisor;
            divi=divisor;
            divisor=rem;
        }
        return divi;
    }
}