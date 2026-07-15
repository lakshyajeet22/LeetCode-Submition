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
        ListNode temp=head;
        if(head==null || head.next==null) return head;
        ArrayList<ListNode> list = new ArrayList<>();
        while(temp.next!=null){
            list.add(temp);
            temp=temp.next;
        }
        

        for(int i=list.size()-1; i>=0; i--){
            list.get(i).next.next=list.get(i);
        }
        if(list.size()>0) list.get(0).next=null;
       
        
        return temp;
    }
}