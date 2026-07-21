/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

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
    public static ListNode rev(ListNode start , ListNode end){
        ListNode prev = null, temp = start, curr=start;
        while(curr!=end){
            temp=temp.next;
            curr.next=prev;
            prev = curr;
            curr=temp;
        }
        return prev;
    }
    public ListNode swapPairs(ListNode head) {
        int k=2;
        if(head==null || head.next==null || k==1) return head;
        ListNode start = head, end = head;
        int i=1;
        while(i<=k){
            if(end==null ) return head;
            end=end.next;
            i++;
        }
        ListNode ans = rev(start, end);
        start.next=swapPairs(end);
        return ans;
    }
}
   
