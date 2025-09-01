// Question Link: https://leetcode.com/problems/valid-palindrome/description/

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        return checkPalindrome(s,0,s.length()-1);
    }

    public boolean checkPalindrome(String s,int start,int end){
        if(start>=end){
            return true;
        }
        
        if(s.charAt(start)==s.charAt(end)){
            return checkPalindrome(s,start+1,end-1);
        }
        
        return false;
    }
}