package Day5;

public class SearchInsertPosition {
    //LeetCode 35: Search Insert Position
    //https://leetcode.com/problems/search-insert-position/?envType=study-plan-v2&envId=top-interview-150

        public static int searchInsert(int[] nums, int target) {
            int n = nums.length;
            int start = 0;
            int end = n-1;
            while(start<=end){
                int mid = start  + (end-start)/2;
                if(nums[mid]==target) return mid;
                if(nums[mid]>target){
                    end = mid-1;
                } else start = mid+1;
            }
            return start;
        }

    public static void main(String[] args) {
        int[] nums ={1,3,5,6};
        int target = 3;
        searchInsert(nums,target);
    }
}
