public class Solution {
    public class Node{
    int data;
    Node next;
        public Node(int data,Node next){
        this.data=data;
        this.next=next;
        }
        public Node(int data){
        this.data=data;
        this.next=null;
        }
    }
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}