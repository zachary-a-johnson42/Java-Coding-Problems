package CodingProblems;

import java.util.ArrayList;
import java.util.List;

public class MiddleOfLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode middleNode(ListNode head) {
        // counter
        int LinkedListLength = 0;
        // I have to return a node, so I'll make an ArrayList of Nodes.
        List<ListNode> LinkedList = new ArrayList<ListNode>();

        // If there's a next, keep moving. if not, we're at the last node.

        while(head.next != null){
            //fill array at index
            LinkedList.add(head);
            //increment counter
            LinkedListLength++;
            //move up to the next index
            head = head.next;
        }

        if(LinkedListLength % 2 == 0) {
            LinkedListLength = (LinkedListLength / 2);
        }

        if (LinkedListLength % 2 == 1){
            LinkedListLength = (LinkedListLength / 2) + 1;
        }

        return LinkedList.get(LinkedListLength);
     }
}
