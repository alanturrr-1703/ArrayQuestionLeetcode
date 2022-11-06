import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2 * nums.length];
        int start = 0;
        int end = nums.length;
        while(end < arr.length){
            arr[start] = nums[start];
            arr[end] = nums[start];
            start += 1;
            end += 1;
        }
        return arr;
    }
}