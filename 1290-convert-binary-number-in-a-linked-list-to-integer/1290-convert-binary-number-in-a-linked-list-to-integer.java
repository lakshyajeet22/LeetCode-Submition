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
    public int size(ListNode head){
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }return size;
    }
    public int getDecimalValue(ListNode head) {
       ListNode temp = head;
       long ans =0, a = size(head)-1;
       while(temp!=null){
            ans+=temp.val*Math.pow(2, a--);
            temp = temp.next;
       }return (int)ans;
    }
}