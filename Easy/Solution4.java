// 1480. Running Sum of 1d Array

class Solution4 {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                ans[i] = nums[i];
            }
            else{
                ans[i] = nums[i]+ans[i-1];
            }
        }
        return ans;
    }
}