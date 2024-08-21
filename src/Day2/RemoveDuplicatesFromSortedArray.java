package Day2;

import java.util.Arrays;
// Leetcode 26
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums){
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
        System.out.println("-------");
    }
}
