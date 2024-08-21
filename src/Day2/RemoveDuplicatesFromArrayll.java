package Day2;

import java.util.Arrays;
// LeetCode 80
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/submissions/1363607980/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesFromArrayll {
    public static int removeDuplicatesll(int[] nums){
        int index =0;
        for (int i = 0; i < nums.length; i++) {
            if(index < 2 || nums[i]!=nums[index-2]){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3};
        removeDuplicatesll(nums);
        System.out.println(Arrays.toString(nums));
    }
}
