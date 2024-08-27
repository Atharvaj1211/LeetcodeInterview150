package Day8;

public class FindPeekElement {
    // LeetCode 162 : Find Peek Element
    // https://leetcode.com/problems/find-peak-element/?envType=study-plan-v2&envId=top-interview-150
        public int findPeakElement(int[] nums) {
            int n=nums.length;
            if(n==1) return 0;
            if(nums[0]>nums[1]) return 0;
            if(nums[n-1]>nums[n-2]) return n-1;

            int low = 1 , high = n-2;
            while(low<=high){
                int mid = (low + high )/2;
                if(nums[mid-1]<nums[mid] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                if(nums[mid]>nums[mid-1]){
                    low = mid+1;
                } else high = mid-1;
            }
            return -1;
        }

}
