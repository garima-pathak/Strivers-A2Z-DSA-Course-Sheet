// Question Link: https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1

class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> l=new ArrayList<>();
        tempFact(n, 1, 1,l);
        return l;
    }
    
    static void tempFact(long n, long i, long fact,ArrayList<Long> list){
        if(fact>n)
            return;
        list.add(fact);
        tempFact(n, i+1, fact*(i+1),list);
    }
}