package Day4;

public class JumpGame {
    // LeetCode 55 : Jump Game
    // https://leetcode.com/problems/jump-game/?envType=study-plan-v2&envId=top-interview-150
    public boolean canJump(int[] nums) {
        int maxIndex =0;
        for(int i = 0;i<nums.length;i++){
            if(i>maxIndex){
                return false;
            }
            maxIndex=Math.max(maxIndex,i+nums[i]);
        }
        return true;
    }
}
