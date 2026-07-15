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
        ListNode temp=head;
        int size=1;
        while( temp!=null && temp.next!=null){
            size++;
            temp=temp.next;
        }
        return size;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if( head==null || head.next==null  ) return head;
        int a=k%size(head);
        while(a-- > 0){
            ListNode temp=head;
            
            if( head==null || temp.next==null ) return head;
            while(temp.next.next != null){
                temp=temp.next;
            }
             ListNode last = temp.next;  

            temp.next = null;
            last.next = head;
            head = last;
        }
        return head;
       

    }
}