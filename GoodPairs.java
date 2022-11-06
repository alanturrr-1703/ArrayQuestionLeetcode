import java.util.ArrayList;
import java.util.List;

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,5,3,1};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1 + i; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count += 1;
                }
            }
        }
        return count;
    }
}
