class Solution {
public:
    bool canBeEqual(vector<int>& target, vector<int>& arr) {
        sort(target.begin(), target.end());
        sort(arr.begin(), arr.end());
        int count = 0;
        for(int i = 0; i < target.size();  i ++){
            if(target[i] != arr[i]){
                count ++;
                break;
            }
        }
        if(count == 1){
            return false;
        }
        else{
            return true;
        }
    }
};