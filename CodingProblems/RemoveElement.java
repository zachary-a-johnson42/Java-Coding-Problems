package CodingProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // converting array into list to use iterator
        List numsList = IntStream.of(nums).boxed().collect(Collectors.toList());
        // setting up iterator for removal
        Iterator<Integer> numsIter = numsList.iterator();
        //setting up a list to catch what the iterator doesn't get rid of
        List returnList = new ArrayList<Integer>();
        // using while loop to go through with iterator and remove elements
        int counter = 0;
        while(numsIter.hasNext()) {
            Integer numToRemove = numsIter.next();
            if ( numToRemove == val){
                numsIter.remove();
                counter++;
            }
            if(numToRemove != val) {
                returnList.add(numToRemove);
            }
        }
        int[] returnArray = returnList.stream().mapToInt(i -> (int) i).toArray();
        return counter;
    }
}
