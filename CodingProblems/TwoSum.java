package CodingProblems;

import java.sql.Array;

public class TwoSum {
    public int[] twoSumSolution(int[] nums, int target) {
        //initializing return array
        int[] returnArray = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                //if both indexes add to target, assign to return array
             if(nums[i] + nums[j] == target){
                returnArray[0] = i;
                returnArray[1] = j;
             }
            }
        }
        return returnArray;
    }
}