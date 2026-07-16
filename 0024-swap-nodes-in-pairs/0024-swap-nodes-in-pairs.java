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
    public void rev(ListNode s, ListNode e){
        
       ListNode crr=s;
       ListNode pr=null;
       while(pr!=e){
            ListNode temp= crr.next;
            crr.next=pr;
            pr=crr;
            crr=temp;

       }



    } 
    public ListNode swapPairs(ListNode head) {
         if(head==null || head.next==null ) return head;
        ListNode s=head;
        ListNode e=head;
        int i=1;
        while(i-- !=0){
            e=e.next;
            if(e==null) return head;
        }
        ListNode ans= swapPairs(e.next);
        rev(s,e);
        s.next = ans;
        return e;
    }
}