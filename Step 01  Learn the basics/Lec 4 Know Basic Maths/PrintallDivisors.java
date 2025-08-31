class Solution {
    public static void print_divisors(int n) {
        for(int i=1;i<=(int)Math.sqrt(n);i++){
           if(n%i==0){
            System.out.print(i+" ");
           }
        }
       for (int i = (int)Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0 && n / i != i) {
                System.out.print((n / i) + " ");
            }
        }
    }
}