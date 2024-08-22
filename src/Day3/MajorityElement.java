package Day3;

import java.util.HashMap;

public class MajorityElement {
    // LeetCode 169: Majority Element in Array
    //https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
    public static void main(String[] args) {
     int[] nums = {3,2,3};
        System.out.println(majorityElement1(nums));
        System.out.println(majorityElement2(nums));
        System.out.println(majorityElement3(nums));
    }
    public static int majorityElement1(int[] nums) {
        // Brute Force Approach [Time Complexity= O(N^2)]
            int n = nums.length;
            for(int i=0;i<n;i++){
                int cnt = 0;
                for(int j=0;j<n;j++){
                    if(nums[j]==nums[i]){
                        cnt++;
                    }
                }
                if(cnt>n/2){
                    return nums[i];
                }
            }
            return -1;
    }

    public static int majorityElement2(int[] nums) {
        // Better Approach [Time Complexity=O(N*logN)+O(N)]
        int n = nums.length;
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i=0;i<n;i++){
            int value = mpp.getOrDefault(nums[i],0);
            mpp.put(nums[i],value+1);
        }
        for(HashMap.Entry<Integer,Integer> it: mpp.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
    public static int majorityElement3(int[] nums) {
        // Optimal Approach [Time Complexity : O(N)+O(N)
        // Moore's Voting Algorithm
        int n = nums.length;
        int cnt = 0;
        int el = 0;
        for(int i = 0;i<n;i++){
            if(cnt == 0 ){
                cnt = 1;
                el = nums[i];
            } else if(el == nums[i]) cnt++;
            else cnt--;
        }
        int cnt1 = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]==el) cnt1++;
        }
        if(cnt1>(n/2)) return el;
        return -1;
    }
}
