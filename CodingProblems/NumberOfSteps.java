package CodingProblems;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class NumberOfSteps {
    public static int numberOfSteps(int num) {
        int numSteps = 0;

        while (num != 0) {

            if (num % 2 == 0) {
                num = num / 2;
                numSteps++;
            }

            if (num % 2 == 1) {
                num = num - 1;
                numSteps++;
            }
        }
        return numSteps;
    }
}
