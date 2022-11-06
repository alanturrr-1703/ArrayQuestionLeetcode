import java.util.ArrayList;
import java.util.List;

public class kidCandy {
    public static void main(String[] args) {
        int[] candies = {3,1,2,5,6};
        System.out.println(kidsWithCandies(candies, 3));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (max(candies) < (candies[i] + extraCandies)){
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
    private static int max(int[] arr){
        int max = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (max < arr[j]){
                max = arr[j];
            }
        }
        return max;
    }

}
