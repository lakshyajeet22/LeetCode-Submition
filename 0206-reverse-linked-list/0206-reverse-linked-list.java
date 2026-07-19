class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        
        if(head == null || head.next==null) return head;
        ListNode nxt = reverseList(head.next);
        head.next.next= head;
        head.next=null;
        return nxt;
        

        
    }
}