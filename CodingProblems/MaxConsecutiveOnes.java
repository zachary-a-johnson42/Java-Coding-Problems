package CodingProblems;

// https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3238/

public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int returnCounter = 0;
        int inLoopCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                inLoopCounter++;
            }

            if(nums[i] == 0) {
                inLoopCounter = 0;
            }

            if(returnCounter < inLoopCounter) {
                returnCounter = inLoopCounter;
            }
        }
        return returnCounter;
    }
}
