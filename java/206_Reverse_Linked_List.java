// Solution 01

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
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode updated = null;
        ListNode given = head;
        ListNode temp = null;
        
        while (given != null) {
            temp = given.next;
            given.next = updated;
            updated = given;
            given = temp;
        }
        
        return updated;
    }
}

// Solution 02

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
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null) {
            return null;
        }
        
        ListNode newHead = head;
        
        if(head.next != null) {
            newHead = reverseList(head.next);
            head.next.next = head;
        }
        
        head.next = null;
        
        return newHead;
    }
}