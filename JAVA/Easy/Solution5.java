// 9. Palindrome Number

class Solution5 {
    public boolean isPalindrome(int x) {
        int orig = x; // 121
        int rem = 0;
        int revs = 0;
        if (x < 0) {
            return false;
        }
        else{
            while(x != 0){
                rem = x % 10; // 121 % 10 = 1  /// 1 = 12 % 10 = 2
                revs = revs * 10 + rem; // 0 = 0 + 1 * 10 = 10  /// 10 = 10 + 2 * 10 = 30
                x /= 10; // 121 = 121 / 10 = 12  /// 1
            }
                if(revs == orig){
                    return true;
                }
                else{
                    return false;
                }
        }
    }
    public static void main(String[] args) {
        Solution5 s = new Solution5();
        System.out.println(s.isPalindrome(-121));
    }
}
