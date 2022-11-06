import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OrderTargetArray {
    public static void main(String[] args) {
        int[] arr = {7,5,8,1};
        int[] index = {0,1,1,2};
        System.out.println(Arrays.toString(createTargetArray(arr, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>(10);
        ans.size();
        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i], nums[i]);
        }
        int[] target = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            target[i] = ans.get(i);
        }
        return target;
    }
}
