class Solution {
    public boolean isPalindrome(int x) {
        int og = 0;
        int temp = 0;
        int emergency = x; 
        if (x < 0) return false;
        while (x > 0) {
            temp = x % 10;
            og = og * 10 + temp;
            x = x / 10;
        }        

        return emergency == og; 
    }
}