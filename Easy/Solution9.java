//  1470. Shuffle the Array

class Solution9 {
    public int[] shuffle(int[] nums, int n) {
        int temp1[] = new int[n];
        int temp2[] = new int[n];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++){
            temp1[i] = nums[i];
        }
        for(int j = n; j < n*2; j++){
            temp2[count2] = nums[j];
            count2++;
        }
        count2 = 0;
        for(int k = 0; k < n*2; k++){
            if(k%2==0){
                nums[k] = temp1[count1];
                count1++;
            }
            else{
                nums[k] = temp2[count2];
                count2++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        Solution9 ob = new Solution9();
        int arr[] = {2,5,1,3,4,7};
        int res[] = new int[arr.length];
        res = ob.shuffle(arr, 3);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}