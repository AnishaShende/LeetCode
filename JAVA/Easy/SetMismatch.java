import java.util.*;

class SetMistach {
    public int[] findErrorNums(int[] nums) {
        int res[] = new int[2];
        int arr[] = new int[nums.length];
        Arrays.fill(arr, 0);
        int dupl = 0;
        int miss = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    dupl = nums[i];
                }
            }
            arr[nums[i] - 1] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                miss = (i + 1);
            }
        }
        res[0] = dupl;
        res[1] = miss;
        return res;
    }
}