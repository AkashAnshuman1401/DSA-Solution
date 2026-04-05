class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int num = x;
        int sum = 0;

        while (x != 0) {
            int rev = x % 10;
            sum = sum * 10 + rev;
            x /= 10;
        }

        return num == sum;
    }
}