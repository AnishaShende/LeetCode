class Test2 {
    public int removeDuplicates(int[] nums) {
        /*int count = 1;
        int temp = 1;
        int a = 0;
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j ++){
                if(nums[i] == nums[j]){
                    nums[j] = nums[nums.length - temp];
                    nums[nums.length - temp] = 0;
                    temp  ++;
                    count ++;
                }
                if(i != 0 && nums[i] == 0){
                    break;
                }
            }
        }*/
        /*for(int i = 0; i < nums.length; i ++){
            if(i != 0 && nums[i] == 0){
                break;
            }
            else{
                a++;
            }
        }*/
        int count = 0;
        int res;
        int arr1[] = new int[nums.length];
        for(int i = 0; i < nums.length; i ++){
            for(int j = i + 1; j < nums.length; j ++){
                if(nums[i] == nums[j]){
                    // count ++;
                    arr1[count] = nums[i];
                    count ++;
                }
            }
        }
        for (int i : arr1) {
            System.out.print(i+" ");
        }
        // res = nums.length - count;
        res = arr1.length;
        return res;
    }
    public static void main(String[] args) {
        Test2 obj = new Test2();
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        // obj.removeDuplicates(arr);
        System.out.println(obj.removeDuplicates(arr));
    }
}