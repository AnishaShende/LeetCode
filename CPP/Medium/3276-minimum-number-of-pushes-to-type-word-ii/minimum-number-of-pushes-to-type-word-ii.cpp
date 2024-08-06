class Solution {
public:
    int minimumPushes(string word) {
        set<char> distinctChar;
        vector<int> freqArr(word.length(), 0);
        unordered_map<char, int> freqMap;
        vector<int> freqVec;
        int count = 0;
        int temp = 0;
        for(char i : word){
            distinctChar.insert(i);
        }
        if(distinctChar.size() <= 8){
            count = word.length();
        }
        else {
            int value = 0;
            for (const auto& element : distinctChar) {
                freqMap[element] = 0;
            }
            for(char c : word){
                auto it = freqMap.find(c);
                it->second++;
            }
            for(const auto& pair : freqMap){
                freqVec.push_back(pair.second);
            }
            sort(freqVec.rbegin(), freqVec.rend());
            for(int i = 0; i < freqVec.size(); i ++){
                if(i+1 <= 8){
                    count += freqVec[i]*1;
                }
                else if(i+1 <= 16){
                    count += freqVec[i]*2;
                }
                else if(i < 24){
                    count += freqVec[i]*3;
                }
                else{
                    count += freqVec[i]*4;
                }
            } 
        }
        return count;
    }
};