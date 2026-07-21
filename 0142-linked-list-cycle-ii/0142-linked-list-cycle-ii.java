/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head, s=head, f=head;
        List<ListNode> list = new ArrayList<>();
        if(head==null || head.next==null) return null;
        while(temp!=null){
            if(list.contains(temp)) return temp;
            list.add(temp);
            temp=temp.next;
            
        }
        return null;

    }
}