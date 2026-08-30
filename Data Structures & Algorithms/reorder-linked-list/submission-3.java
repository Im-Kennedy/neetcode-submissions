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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }

        ListNode l1 = head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode l2 = reverse(slow);
        merge(l1, l2);
    }


    public ListNode reverse(ListNode head){
        ListNode prev = null;

        while(head != null){
            ListNode savedNode = head.next;
            head.next = prev;
            prev = head;
            head = savedNode;
        }
        return prev;
    }

    public void merge(ListNode l1, ListNode l2){
        while(l1 != null){
            ListNode l1next = l1.next;
            ListNode l2next = l2.next;
            l1.next = l2;
            if(l1next == null){
                break;
            }
            l2.next = l1next;
            l1 = l1next;
            l2 = l2next;
        }

    }
}
