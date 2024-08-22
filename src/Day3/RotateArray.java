package Day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {
    // LeetCode 189 : Rotate Array
    // https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,7,8};
        rotate(nums,2);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums, int k) {
        // Time Complexity : O(N)
        int n = nums.length;
        k = k%n;
        if(k>n){
            return;
        }
        int[] temp = new int[k];
        for(int i=n-k;i<n;i++){
            temp[i-n+k]=nums[i];
        }
        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
    }
}
