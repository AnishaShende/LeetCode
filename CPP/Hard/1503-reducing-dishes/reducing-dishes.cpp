class Solution {
public:
    int sumOfElements(vector<int> &arr, int n){
        // cout<<"n inside sumOfElements: "<<n<<endl;
        int sum = 0;
        for(int i = 0; i < n; i++){
            // cout<<" arr["<<i<<"] = "<<arr[i]<<" "<<"n = "<<n<<endl;
            sum += arr[i]*(n-i);
            // cout<<"sum: "<<sum<<endl;
        }
        return sum;
    }

    int maxSatisfaction(vector<int>& satisfaction) {
        sort(satisfaction.begin(), satisfaction.end());
        vector<int> rangedArr(satisfaction.size(), 0);
        int index = 0;
        int sum = 0;
        int prevSum = 0;
        for(int i = satisfaction.size()-1; i >= 0; i--){
            prevSum = sum;
            rangedArr[index] = satisfaction[i];
            // cout<<"rangedArr ["<<index<<"] = "<<rangedArr[index]<<endl;
            sum = sumOfElements(rangedArr, index+1);
            // cout<<"sum = "<<sum<<" "<<endl;
            index++;
            if(sum < prevSum){
                // cout<<"returning prev sum "<<prevSum<<endl;
                return prevSum;
            }
            if(sum <= 0){
                return 0;
            }
        }
        return sum;
    }
};