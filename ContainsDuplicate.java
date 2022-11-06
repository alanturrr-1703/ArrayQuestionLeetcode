public class ContainsDuplicate {
    public static void main(String[] args) {

    }
    public boolean containsDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        boolean ans = false;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j){
                    if (nums[i] == nums[j]){
                        count += 1;
                    }
                }
            }
            arr[i] = count;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                ans = true;
            }
        }
        return ans;
    }
}
