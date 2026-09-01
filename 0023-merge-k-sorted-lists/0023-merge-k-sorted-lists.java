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
 class Pair implements Comparable<Pair>{
    int val;
    ListNode root;
    Pair(int val, ListNode root){
        this.val=val;
        this.root=root;
    }
    public int compareTo(Pair that){
        return this.val-that.val;
    }
 }
class Solution {
    public ListNode mergeKLists(ListNode[] l) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(ListNode i : l){
            if(i==null) continue;
            pq.offer(new Pair(i.val,i));
        }
        ListNode dum = new ListNode(-1);
        ListNode temp = dum;
        while(pq.size()!=0){
            Pair obj = pq.poll();
           if(obj.root==null){
                pq.poll();
           }else{
                temp.next = obj.root;
                temp = temp.next;
                if(temp.next!=null){
                    pq.offer(new Pair(temp.next.val, temp.next));
                }
           }

            
        }
        return dum.next;
    }
}