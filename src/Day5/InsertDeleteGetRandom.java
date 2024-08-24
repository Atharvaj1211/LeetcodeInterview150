package Day5;

import java.util.*;

public class InsertDeleteGetRandom {
    // LeetCode 380: Insert Delete GetRandom O(1)
    //https://leetcode.com/problems/insert-delete-getrandom-o1/?envType=study-plan-v2&envId=top-interview-150
        public Map<Integer, Integer> valtoIndex = new HashMap<>();
        public List<Integer> vals = new ArrayList<>();
        public Random rand = new Random();
        public InsertDeleteGetRandom() {

        }

        public boolean insert(int val) {
            if(valtoIndex.containsKey(val)){
                return false;
            }
            valtoIndex.put(val,vals.size());
            vals.add(val);
            return true;
        }

        public boolean remove(int val) {
            if(!valtoIndex.containsKey(val)){
                return false;
            }
            //int last = vals.size()-1;
            int index = valtoIndex.get(val);
            valtoIndex.put(last(vals),index);
            valtoIndex.remove(val);
            vals.set(index, last(vals));
            vals.remove(vals.size()-1);
            return true;
        }

        public int getRandom() {
            int index = rand.nextInt(vals.size());
            return vals.get(index);
        }
        private int last(List<Integer> vals) {
            return vals.get(vals.size() - 1);
        }
    }

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
