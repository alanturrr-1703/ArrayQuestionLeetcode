public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr, 2));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            int mid = start + (end - start) / 2;
            if (target > nums[mid] ){
                start = mid;
            } else if (target < nums[mid]){
                end = mid;
            } else if (target == nums[mid]){
                return mid;
            }
        }
        return end;
    }
}
