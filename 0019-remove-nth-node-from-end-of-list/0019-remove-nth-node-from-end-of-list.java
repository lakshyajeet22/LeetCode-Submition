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
    public static int size(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }return size;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = size(head);
        ListNode temp = head;
        
        if(head.next == null && n==1) return null;
        if (size == n) {
            return head.next;
        }
        for(int i=0; i<size-n-1; i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return head;
    }
}