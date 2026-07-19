/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode temp = h1;
        Set<ListNode> set = new HashSet<>();

        while(temp!=null){
            set.add(temp);
            temp=temp.next;
        }
        ListNode tem2 = h2;
        while(tem2!=null){
            if(set.contains(tem2)) return tem2;
            else set.add(tem2);
            tem2=tem2.next;
        }

        return null;
    }
}