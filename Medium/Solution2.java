//  2149. Rearrange Array Elements by Sign

class Solution2 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int pos = 0, neg = 0;
        int posarr[] = new int[n/2];
        int negarr[] = new int[n/2];
        int resarr[] = new int[n];
        for(int i = 0; i < n; i ++){
            if(nums[i] < 0){
                negarr[neg] = nums[i];
                neg ++;
            }
            else{
                posarr[pos] = nums[i];
                pos ++;
            }
        }
        pos = 0;
        neg = 0;
        for(int i = 0; i < n; i ++){
            if(i%2==0){
                resarr[i] = posarr[pos];
                pos ++;
            }
            else{
                resarr[i] = negarr[neg];
                neg ++;
            }
        }
        return resarr;
    }
}