// 1672. Richest Customer Wealth

public class RichestCustomer {

    public int maximumWealth(int[][] accounts) {
        int wealth = 0, sum = 0;
        int m = accounts.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if(sum >= wealth){
                wealth = sum;
            }
            sum = 0;
        }
        return wealth;
    }
    public static void main(String[] args) {
        RichestCustomer account = new RichestCustomer();
        int arr[][] = {{1,5},{7,3},{3,5}};
        System.out.println(account.maximumWealth(arr));
    }
}
