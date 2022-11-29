class Solution1 {
    public int[] canSeePersonsCount(int[] heights) {
        int arr[] = new int[heights.length];
        int count = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            if (i == heights.length - 1) {
                arr[heights.length-1] = 0;
                break;
            }
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("count = "+count);
                if (heights[i] > heights[j]) {
                    System.out.println("i = "+i+" j = "+j+" Inside the if");
                    if(j == 1){
                        count ++;
                        continue;
                    }
                    // else if(j == max){
                    //     System.out.println("Inside - maxxxxxxxxxxxxxxxxxxxxxx");
                    //     count ++;
                    //     break;
                    // }
                    else if(heights[j] < heights[i] && i == j -1){
                        System.out.println("Inside new else if!");
                        count ++;
                    }
                    // else if(i >= 1 && i <= max x&& j > max){
                    //     // continue;
                    //     break;
                    // }
                    else if(heights[j] > heights[j-1]){
                        System.out.println("Inside desired statement");
                        // if(j > max && i > max){
                        //     System.out.println("Inside maxxxxxxxxxxxx");
                        //     break;
                        // }
                        // else{
                            count ++;
                        // }
                    }
                    // else if(j == heights.length - 1){
                    //     count ++;
                    // }
                    // else if(){
                    // }
                    else{
                        continue;
                    }
                }
                // else if(heights[j] > heights[j-1] && i == j - 1){
                //     System.out.println("i = "+i+" j = "+j+" Inside the first else if");
                //     count ++;
                // }
                // else if(j > max && i >= 1 && i <= max){
                //     continue;
                // }
                else if (heights[i] < heights[j]) {
                    if(heights[j] > max){
                        max = j;
                    }
                    System.out.println("i = "+i+" j = "+j+" Inside the else if");
                    count ++;
                    break;
                }
                else if(j == heights.length - 1){
                    System.out.println("Inside the another else if");
                    count ++;
                }
            }
            System.out.println("i = "+i+" count = "+count);
            arr[i] = count;
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution1 obj = new Solution1();
        int arr[] = {11,19,12,15,14,18,7,1,8,9};
        // int arr[] = {10,6,8,5,11,9};
        // int arr[] = {5,1,2,3,10};
        // int arr[] = {4,3,2,1};
        int res[] = obj.canSeePersonsCount(arr);
        for (int i : res) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
