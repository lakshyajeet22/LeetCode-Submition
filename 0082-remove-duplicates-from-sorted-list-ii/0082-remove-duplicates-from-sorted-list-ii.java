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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode temp = head;
        while(temp!=null){
            map.put(temp.val, map.getOrDefault(temp.val, 0)+1);
            temp=temp.next;
        }
        ListNode dumm = new ListNode(-1);
        ListNode c = dumm;
        temp = head;
        while(temp!=null){
            if(map.get(temp.val)==1){
                c.next=temp;
                c=c.next;
            }
            temp = temp.next;
               
        }
         c.next=null;
        return dumm.next;
    }
}