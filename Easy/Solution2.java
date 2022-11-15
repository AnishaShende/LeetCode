import java.util.*;
class Solution2 {
    public int[] getConcatenation(int[] nums) {
        int n = 2*nums.length;
        int[] ans = new int[n];
        for(int i = 0; i < ans.length; i++){
            if(i < nums.length){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i-nums.length];
            }
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        Solution2 s = new Solution2();
        // int[] res = s.getConcatenation(arr);
        System.out.println(s.getConcatenation(arr));
    }
}