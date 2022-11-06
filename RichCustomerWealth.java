public class RichCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int[] arr = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int total = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                total += accounts[i][j];
            }
            arr[i] = total;
        }
        return max(arr);
    }

    private static int max(int[] arr) {
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]){
                max = arr[j];
            }
        }
        return max;
    }

}
