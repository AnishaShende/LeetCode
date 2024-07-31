class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        for(int i = 1; i < nums.size(); i++){
            for(int j = i-1; j >= 0; j--){
                if(nums[i] == nums[j]){
                    nums[i] = -1000;
                    break;
                }
            }
        }
        auto it = std::remove(nums.begin(), nums.end(), -1000);
        nums.erase(it, nums.end());

        for(int i = 0; i < nums.size(); i ++){
            cout<<nums[i]<<endl;
        }

        return nums.size();
    }
};