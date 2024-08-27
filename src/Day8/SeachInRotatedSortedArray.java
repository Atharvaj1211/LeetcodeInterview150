package Day8;

public class SeachInRotatedSortedArray {

        // LeetCode 33 : Search in Rotated Sorted Array
        // https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/1370197600/?envType=study-plan-v2&envId=top-interview-150

        public int search(int[] nums, int target) {
            int n = nums.length;
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid = (low+high)/2;
                if(nums[mid] == target){
                    return mid;
                }
                if(nums[low]<=nums[mid]){
                    if(nums[low]<= target && target < nums[mid]){
                        high = mid-1;
                    } else {
                        low = mid+1;
                    }
                }else {
                    if(nums[mid]< target && target <= nums[high]){
                        low = mid+1;
                    } else {
                        high = mid-1;
                    }
                }
            }
            return -1;
        }
    }

