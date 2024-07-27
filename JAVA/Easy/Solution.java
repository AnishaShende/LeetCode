//2469. Convert the Temperature

import java.util.*;

class Solution {
    public double[] convertTemperature(double celsius) {
        double arr[] = new double[2];
        double k = celsius+273.15;
        double f = celsius*1.80+32.00;
        arr[0] = k;
        arr[1] = f;
        return arr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Solution c = new Solution();
        int i = sc.nextInt();
        double[] res = c.convertTemperature(i);
        System.out.println(res);
    }
}