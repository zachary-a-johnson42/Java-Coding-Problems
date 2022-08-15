package CodingProblems;

import java.sql.Array;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] returnArray = new int[nums.length];
        // squaring everything in the nums array
        for (int i = 0; i < nums.length; i++) {
            returnArray[i] = nums[i] * nums[i];
        }

        //creating intStream
        Stream<Integer> returnStream = Arrays.stream(returnArray).boxed();
        //Sorting and casting stream back to int[]
        returnArray = returnStream.mapToInt(item -> item).sorted().toArray();

        return returnArray;
    }
}
