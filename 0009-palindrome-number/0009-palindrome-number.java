class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        if (x < 0) return false;
        if (x == 0) return true;
        int len = s.length() - 1; 
        for (int i = 0; i < len; i++){
            if(s.charAt(i) != s.charAt(len -i)) return false; 
        }
        return true;         
    }
}