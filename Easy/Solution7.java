// 2011. Final Value of Variable After Performing Operations

class Solution7 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for(int i = 0; i < operations.length; i++){
            char ch[] = new char[operations[i].length()];
            for (int j = 0; j < 3; j++) {
                ch[j] = operations[i].charAt(j);
                if(ch[j] == '+'){
                    x++;
                    break;
                }
                else if(ch[j] == '-'){
                    x--;
                    break;
                }
                else{
                    continue;
                }
            }
        }
        return x;
    }
}