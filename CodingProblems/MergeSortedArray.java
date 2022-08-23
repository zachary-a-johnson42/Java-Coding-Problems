package CodingProblems;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Create a new array to store stuff into?
        int[] returnArray = new int[m+n];

        // nested for loop?
        //nums1 [1,2,3]
        //nums2 [4,5,6]

        for (int i = 0; i < returnArray.length; i++) {
            System.out.printf("first array is currently : %s%n", nums1[i]);
            for (int j = 0; j < returnArray.length - 1; j++) {
                System.out.printf("second array is at : %s%n", nums2[j]);

            }
        }

        System.out.println(returnArray.toString());
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};

        merge(nums1, 2, nums2, 2);
    }
}
