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
    /**
     * Removes duplicates from a sorted linked list.
     * Each element will appear only once in the resulting list.
     * 
     * @param head The head of the sorted linked list
     * @return The head of the linked list after removing duplicates
     */
    public ListNode deleteDuplicates(ListNode head) {
        // Initialize current pointer to traverse the list
        ListNode current = head;
      
        // Traverse the list until we reach the end
        while (current != null && current.next != null) {
            // Check if current node's value equals the next node's value
            if (current.val == current.next.val) {
                // Skip the duplicate node by updating the pointer
                // This effectively removes the duplicate from the list
                current.next = current.next.next;
            } else {
                // No duplicate found, move to the next node
                current = current.next;
            }
        }
      
        // Return the modified list with duplicates removed
        return head;
    }
}
