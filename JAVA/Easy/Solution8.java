/*
////////////////////////////////////////////////////////////////


                    13. Roman to Integer



///////////////////////////////////////////////////////////////

*/









class Solution8 {
    // public int romanToInt(String s) {
    //     char ch[] = new char[s.length()];
    //     int arr[] = new int[ch.length];
    //     int ans = 0;
    //     int value = 0;
    //     ch = s.toCharArray();
    //     /*// if (ch[0] == 'I') {
    //     //     ans += 1;
    //     // }
    //     // else if(ch[0] == 'V'){
    //     //     ans += 5;
    //     // }
    //     // else if(ch[0] == 'X'){
    //     //     ans += 10;
    //     // }
    //     // else if(ch[0] == 'L'){
    //     //     ans += 50;
    //     // }
    //     // else if(ch[0] == 'C'){
    //     //     ans+= 100;
    //     // }
    //     // else if(ch[0] == 'D'){
    //     //     ans += 500;
    //     // }
    //     // else if(ch[0] == 'M'){
    //     //     ans += 1000;
    //     // }
    //     */
    //     for (int i = 0; i < ch.length; i++) {
    //         /*// if (ch[i] == 'V' && ch[i-1] == 'I') {
    //         //     ans += 4;
    //         //     break;
    //         // }
    //         // else if(ch[i] == 'X' && ch[i-1] == 'I'){
    //         //     ans += 9;
    //         //     break;
    //         // }
    //         // else if(ch[i] == 'L' && ch[i-1] == 'X'){
    //         //     ans += 40;
    //         //     break;
    //         // }
    //         // else if(ch[i] == 'C' && ch[i-1] == 'X'){
    //         //     ans += 90;
    //         //     break;
    //         // }
    //         // else if(ch[i] == 'D' && ch[i-1] == 'C'){
    //         //     ans += 400;
    //         //     break;
    //         // }
    //         // else if(ch[i] == 'M' && ch[i-1] == 'C'){
    //         //     ans += 900;
    //         //     break;
    //         // }
    //         // else if (ch[i] == 'I') {
    //         //     ans += 1;
    //         // }
    //         // else if(ch[i] == 'V'){
    //         //     ans += 5;
    //         // }
    //         // else if(ch[i] == 'X'){
    //         //     ans += 10;
    //         // }
    //         // else if(ch[i] == 'L'){
    //         //     ans += 50;
    //         // }
    //         // else if(ch[i] == 'C'){
    //         //     ans += 100;
    //         // }
    //         // else if(ch[i] == 'D'){
    //         //     ans += 500;
    //         // }
    //         // else if(ch[i] == 'M'){
    //         //     ans += 1000;
    //         // }*/
    //         switch (ch[i]) {
    //             case 'I':
    //                 arr[i] = 1;
    //                 break;
    //             case 'V':
    //                 arr[i] = 5;
    //                 break;
    //             case 'X':
    //                 arr[i] = 10;
    //                 break;
    //             case 'L':
    //                 arr[i] = 50;
    //                 break;
    //             case 'C':
    //                 arr[i] = 100;
    //                 break;
    //             case 'D':
    //                 arr[i] = 500;
    //                 break;
    //             case 'M':
    //                 arr[i] = 1000;
    //         }
    //         /*if (ch[i] == 'I') {
    //             if (ch[i+1] == 'V') {
    //                 ans += 4;
    //             }
    //             else if(ch[i+1] == 'X'){
    //                 ans += 9;
    //             }
    //             else{
    //                 ans += 1;
    //             }
    //         }
    //         else if (ch[i] == 'X') {
    //             if (ch[i+1] == 'L') {
    //                 ans += 40;
    //             }
    //             else if(ch[i+1] == 'C'){
    //                 ans += 90;
    //             }
    //             else{
    //                 ans += 10;
    //             }
    //         }
    //         else if (ch[i] == 'C') {
    //             if (ch[i+1] == 'D') {
    //                 ans += 400;
    //             }
    //             else if(ch[i+1] == 'M'){
    //                 ans += 900;
    //             }
    //             else{
    //                 ans += 100;
    //             }
    //         }
    //         else if(ch[i] == 'V'){
    //             ans += 5;
    //         }
    //         else if(ch[i] == 'X'){
    //             ans += 10;
    //         }
    //         else if(ch[i] == 'L'){
    //             ans += 50;
    //         }
    //         else if(ch[i] == 'C'){
    //             ans += 100;
    //         }
    //         else if(ch[i] == 'D'){
    //             ans += 500;
    //         }
    //         else if(ch[i] == 'M'){
    //             ans += 1000;
    //         }
    //         */
    //     }
    //     for (int j = 0; j < arr.length-1; j++) {
    //         // if (j == arr.length-1) {
    //         //     break;
    //         // }
    //         for (int j2 = j+1; j2 <= j+1; j2++) {
    //             if(arr[j] < arr[j2]){
    //                 if(arr[j] == 1 && arr[j2] == 5){
    //                     ans += 4;
    //                 }
    //                 else if(arr[j] == 1 && arr[j2] == 10){
    //                     ans += 9;
    //                 }
    //                 else if(arr[j] == 10 && arr[j2] == 50){
    //                     ans += 40;
    //                 }
    //                 else if(arr[j] == 10 && arr[j2] == 100){
    //                     ans += 90;
    //                 }
    //                 else if(arr[j] == 100 && arr[j2] == 500){
    //                     ans += 400;
    //                 }
    //                 else if(arr[j] == 100 && arr[j2] == 1000){
    //                     ans += 900;
    //                 }
    //             }
    //             else{
    //                 ans += arr[j];
    //             }
    //         }
    //     }
    //     return ans;
    // }
    public int romanToInt(String s) {
        char ch[] = new char[s.length()];
        int arr[] = new int[ch.length];
        int ans = 0;
        int value = 0;
        int j = 0;
        ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'I':
                    arr[i] = 1;
                    break;
                case 'V':
                    arr[i] = 5;
                    break;
                case 'X':
                    arr[i] = 10;
                    break;
                case 'L':
                    arr[i] = 50;
                    break;
                case 'C':
                    arr[i] = 100;
                    break;
                case 'D':
                    arr[i] = 500;
                    break;
                case 'M':
                    arr[i] = 1000;
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        for (j = 0; j < arr.length; j++) {
            value = 0;
            if(j == arr.length-1){
                ans += arr[j];
                break;
            }
            for (int j2 = j+1; j2 <= j+1; j2++) {
                // System.out.print("arr[j] = "+arr[j]+"  "+"arr[j1] = "+arr[j2]+"   ");
                if(j2 == arr.length || value == 1){
                    break;
                }
                // System.out.print(" Before j = "+j);
                // System.out.print(" Before j2 = "+j2);
                // System.out.print("Before ans = "+ans+" ");
                // System.out.println();
                if(arr[j] < arr[j2]){
                    if(arr[j] == 1 && arr[j2] == 5){
                        ans += 4;
                        // j = j + 2;
                        j++;
                    }
                    else if(arr[j] == 1 && arr[j2] == 10){
                        ans += 9;
                        // j = j + 2;
                        j++;
                    }
                    else if(arr[j] == 10 && arr[j2] == 50){
                        ans += 40;
                        // j = j + 2;
                        j++;
                    }
                    else if(arr[j] == 10 && arr[j2] == 100){
                        ans += 90;
                        // j = j + 2;
                        j++;
                    }
                    else if(arr[j] == 100 && arr[j2] == 500){
                        ans += 400;
                        // j = j + 2;
                        j++;
                    }
                    else if(arr[j] == 100 && arr[j2] == 1000){
                        ans += 900;
                        // j = j + 2;
                        j++;
                    }
                }
                
                else{
                    ans += arr[j];
                }
                // System.out.print(" After j = "+j);
                // System.out.print(" After j2 = "+j2);
                // System.out.print(" After ans = "+ans);
                // System.out.println();
                
                value++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution8 s = new Solution8();
        System.out.println(" "+s.romanToInt("MCMXCIV")+" ");
    }
}
/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */