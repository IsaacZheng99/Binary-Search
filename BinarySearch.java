package leetcode;

public class BinarySearch {
    public int searchInsert(int[] nums, int target){
        int l = nums.length;
        int ans = l;
        int left = 0;
        int right = l - 1;
        int mid;
        while(left <= right){
            mid = ((right - left) >> 1) + left;
            if(nums[mid] >= target){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3 ,4 ,5};
        int target = 8;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.searchInsert(nums, target));
    }
}
