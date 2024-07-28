class Solution {
public:
    int maxFrequencyElements(vector<int>& nums) {
        // cout<<"inside function"<<endl;
        int count = 1;
        int res = 0;
        int n = 0;
        vector<int> eleFreq(nums.size(), 0);
        // cout<<"eleFreq "<<endl;
        for(int i = 0; i < nums.size(); i ++){
            // cout<<"before count "<<count<<endl;
            eleFreq[i] = count++;
            n += eleFreq[i];
            // cout<<"eleFreq["<<i<<"] = "<<eleFreq[i]<<endl;
            
            // cout<<"after count "<<count<<endl;
            for(int j = i+1; j < nums.size(); j++){
                if(nums[i] == nums[j]){
                    eleFreq[i] = count++;
                    n = eleFreq[i];
                }
            }
            // cout<<" this is n = "<<n<<endl;
            if(n == nums.size()){
                // cout<<"haha inside nums"<<endl;
                break;
            }
            count = 1;
            // cout<<eleFreq[i]<<endl;
        }
        // cout<<"after loop"<<endl;
        sort(eleFreq.begin(), eleFreq.end());
        int maxFrequency = eleFreq.back();
        res = maxFrequency;

        for (int i = eleFreq.size() - 2; i >= 0; --i) {
            if (eleFreq[i] == maxFrequency) {
                res += eleFreq[i];
            } else {
                break;
            }
        }
        // cout<<"returning results"<<endl;
        return res;
    }
};