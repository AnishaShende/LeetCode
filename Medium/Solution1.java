class Solution1 {
    public int reverse(int x) {
        int rev = 0;
        int rem = 0;
        if(x > Integer.MAX_VALUE || x < Integer.MIN_VALUE){
            return 0;
        }
        else{
            while(x != 0){
                rem = x % 10;
                rev = (rev*10)+rem;
                x /= 10;
            }
            return rev;
        }
    }
}