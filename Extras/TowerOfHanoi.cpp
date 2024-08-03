#include <iostream>
#include <vector>
using namespace std;

class TowerOfHanoi {

public:
    void TOH(int n, int A, int B, int C, vector<vector<int>>& ACPair, int& count) {
        if (n > 0) {
            TOH(n-1, A, C, B, ACPair, count);
            cout << " From " << A << " to " << C << endl;
            ACPair.push_back({A, C});
            count++;
            TOH(n-1, B, A, C, ACPair, count);
        }
    }

    void stackPrint(vector<int> A, vector<int> B, vector<int> C) {
        int maxSize = max(max(A.size(), B.size()), C.size());
        for (int i = maxSize - 1; i >= 0; i--) {
            if (i < A.size())
                cout << " | " << A[i] << " | ";
            else
                cout << " |   | ";

            if (i < B.size())
                cout << "  | " << B[i] << " | ";
            else
                cout << "  |   | ";

            if (i < C.size())
                cout << "  | " << C[i] << " | ";
            else
                cout << "  |   | ";

            cout << endl;
        }
        cout << " _____" << "   " << "_____" << "   " << "_____" << "  " << endl;
        cout << "   A  " << "   " << "  B  " << "   " << "  C  " << "  " << endl;
        cout << endl << endl;
    }

    void printTOH(vector<vector<int>>& ACP, int n) {
        vector<int> A(n);
        vector<int> B;
        vector<int> C;
        
        for (int i = 0; i < n; i++) {
            A[i] = n - i;
        }

        stackPrint(A, B, C);

        for (int i = 0; i < ACP.size(); i++) {
            int from = ACP[i][0];
            int to = ACP[i][1];
            int element = 0;

            if (from == 1) {
                element = A.back();
                A.pop_back();
            } else if (from == 2) {
                element = B.back();
                B.pop_back();
            } else if (from == 3) {
                element = C.back();
                C.pop_back();
            }

            if (to == 1) {
                A.push_back(element);
            } else if (to == 2) {
                B.push_back(element);
            } else if (to == 3) {
                C.push_back(element);
            }
            stackPrint(A, B, C);
        }
    }
};

int main() {
    TowerOfHanoi t;
    int n;
    cout << "Enter the number of rings: ";
    cin >> n;
    cout << endl;
    vector<vector<int>> ACP;
    int count = 0;
    t.TOH(n, 1, 2, 3, ACP, count);
    t.printTOH(ACP, n);
    return 0;
}
