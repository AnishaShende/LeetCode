
class Solution {
public:
    bool isDup = false;
    string strDup;

    string kthDistinct(vector<string>& arr, int k) {
        set<int> toErase;
        
        for (int i = 0; i < arr.size(); ++i) {
            isDup = false;
            for (int j = i + 1; j < arr.size(); ++j) {
                if (arr[i] == arr[j]) {
                    isDup = true;
                    toErase.insert(j);
                }
            }
            if (isDup) {
                toErase.insert(i);
            }
        }
        vector<int> myVector(toErase.begin(), toErase.end());
        reverse(myVector.rbegin(), myVector.rend());
        for (int index : myVector) {
            arr.erase(arr.begin() + index);
            index --;
        }

        if (k > arr.size()) {
            return "";
        } else {
            return arr[k-1];
        }
    }
};