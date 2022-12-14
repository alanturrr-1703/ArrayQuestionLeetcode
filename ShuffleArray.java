import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(shuffle(arr, 5)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < (2 * n) - 1; i += 2) {
            arr[i] = nums[i/2];
            arr[i + 1] = nums [n + i/2];
        }
        return arr;
    }
}
