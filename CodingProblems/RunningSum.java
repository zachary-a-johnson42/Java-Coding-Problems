package CodingProblems;

//https://leetcode.com/problems/running-sum-of-1d-array/

public class RunningSum {
    public int[] runningSum(int[] nums) {
        int arrayInitializer = nums.length;
        int[] outputArray = new int[arrayInitializer];
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            outputArray[i] = counter + nums[i];
            counter = counter + nums[i];
        }
        return outputArray;
    }
}