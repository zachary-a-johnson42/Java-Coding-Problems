package CodingProblems;

//https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/

//TODO: Given an array nums of integers, return how many of them contain an even number of digits.

public class EvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if(Integer.toString(nums[i]).length() % 2 == 0) {
                counter++;
            } else {continue;}
        }
        return counter;
    }
}
