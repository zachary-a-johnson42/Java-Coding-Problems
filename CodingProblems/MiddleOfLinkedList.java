package CodingProblems;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/middle-of-the-linked-list/
// public class MiddleOfLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
//
//    public ListNode middleNode(ListNode head) {
//        //Setting Double Pointers.
//        ListNode middle = head;
//        ListNode end = head;
//
//        //Make the end move twice, and the middle move once. when the end reaches the end, the middle should be in the middle;
//
//        //While end isn't null, and the there's still something to move forward into one space.
//        while (end != null && end.next != null) {
//            //move 2
//            end = end.next.next;
//            //move 1
//            middle = middle.next;
//        }
//        return middle;
//    }
//}
