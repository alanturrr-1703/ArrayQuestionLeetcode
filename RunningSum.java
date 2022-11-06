import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int curr = 0;
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            arr[i] = curr;
        }
        return arr;
    }
}
