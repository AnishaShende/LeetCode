class Solution3 {
    public int[] buildArray(int[] nums) {
        // int n = nums.length;
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}