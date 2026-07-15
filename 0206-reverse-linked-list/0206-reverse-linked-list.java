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
        list.get(0).next=null;
       
        
        return temp;
    }
}
