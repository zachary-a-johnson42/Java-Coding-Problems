package CodingProblems;

import java.sql.Array;

// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {

        //TODO: REVIEW THIS ONE. I DON'T QUITE UNDERSTAND HOW ITS WORKING.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                int next = arr[i + 1];

                int next_ = 0;

                arr[i + 1] = 0;

                int j = i + 1;

                while (j < arr.length - 1) {
                    next_ = arr[j + 1];
                    arr[j + 1] = next;
                    next = next_;
                    j++;
                }
                i++;
            }
        }
    }
}
