// 1528. Shuffle String

class Solution17 {
    public String restoreString(String s, int[] indices) {
        String str = new String();
        for(int i = 0; i < indices.length; i ++){
            for(int j = 0; j < indices.length; j ++){
                if(i == indices[j]){
                    str += s.charAt(j);
                }
            }
        }
        return str;
    }
    public static void main(String[] args) {
        Solution17 obj = new Solution17();
        int arr[] = {4,5,6,7,0,2,1,3};
        String s = obj.restoreString("codeleet", arr);
        System.out.println(s);
    }
}
