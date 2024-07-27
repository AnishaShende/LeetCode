// Code for Integer to String array conversion

// class Solution14{
//     public static void main(String[] args) {
//         int arr[] = {1, 2,3};
//         String arr1[] = new String[arr.length];
//         // arr.toString();
//         // System.out.println(arr);
//         for (int i : arr) {
//             System.out.println(i);
//         }
//         for (int i = 0; i < arr1.length; i++) {
//             arr1[i] = String.valueOf(arr[i]);
//         }
//         for (String i : arr1) {
//             System.out.println(i);
//         }
//         // System.out.println(arr1);
//         // System.out.println(Integer.parseInt(arr[2]));
//     }
// }

//  Incomplete solution

class Solution14 {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int temp = 1;
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j ++){
                if(nums[i] == nums[j]){
                    nums[j] = nums[nums.length - temp];
                    temp ++;
                    nums[nums.length - temp] = 0;
                    count ++;
                }
                if(i != 0 && nums[i] == 0){
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        
    }
}