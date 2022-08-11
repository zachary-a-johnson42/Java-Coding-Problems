package CodingProblems;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/fizz-buzz/

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {

        List<String> outputList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if( i % 15 == 0){
                outputList.add("FizzBuzz");
            } else if ( i % 5 == 0) {
                outputList.add("Buzz");
            } else if (i % 3 == 0) {
                outputList.add("Fizz");
            } else {
                outputList.add(Integer.toString(i));
            }
        }
        return outputList;
    }
}
