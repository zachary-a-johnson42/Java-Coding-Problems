package CodingProblems;

import java.sql.Array;

// https://leetcode.com/explore/learn/card/fun-with-arrays/525/inserting-items-into-an-array/3245/
// Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        // how many zeros there are.
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                counter++;
            }
        }

        int[] returnArray = new int[arr.length + counter];

        for (int i = 0; i < arr.length; i++) {
            
            if(arr[i] != 0) {
                returnArray[i] = arr[i];
            }
            
            if(arr[i] == 0){
                arr[i] = 0;
                arr[i+1] = 0;
                i = i + 1;
            }
        }
        arr = returnArray;
    }

    public static void main(String[] args) {

    }
}
