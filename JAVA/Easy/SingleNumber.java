class SingleNumber {
    public static void main(String[] args) {
        // int arr[] = {4, 1, 2, 1, 2};
        // int arr[] = {1, 0, 1};
        int arr[] = { 2, 2, 1 };
        int num = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (num == arr[i]) {
                num = arr[i + 1];
                i++;
            }
        }
        System.out.println(num);
    }
}