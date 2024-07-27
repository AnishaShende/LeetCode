// 1464. Maximum Product of Two Elements in an Array

class MaximumProduct {
    public int maxProduct(int[] nums) {
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] < nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
            // System.out.print(nums[i] + " ");
        }
        return (nums[0]-1)*(nums[1]-1);
    }
    public static void main(String[] args) {
        MaximumProduct obj = new MaximumProduct();
        int[] arr = {3,4,5,2};
        System.out.println(obj.maxProduct(arr));
    }
}