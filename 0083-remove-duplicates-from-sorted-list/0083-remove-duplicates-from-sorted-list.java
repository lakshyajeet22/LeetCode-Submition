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
    public ListNode rec(ListNode head){
        if(head==null || head.next== null) return head;
        ListNode ans=rec(head.next);
        if(ans.val == head.val) return ans;
        else {
            head.next=ans;
            return head;
        }

    }
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode temp=head;
        // if(head==null || head.next==null) return head;
        // while(temp!=null){
        //     if(temp.next!=null && temp.val==temp.next.val){
        //         temp.next=temp.next.next;
        //     }else{
        //         temp=temp.next;
        //     }
        // }return head;
        return rec(head);
    }
}