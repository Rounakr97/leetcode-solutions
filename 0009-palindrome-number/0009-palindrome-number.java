class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
            }
        if(x<10){
            return true;
            }
        int org=x;
        long rev=0;
        while(x!=0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(org==rev){
            return true;
        }
         return false;
}
}