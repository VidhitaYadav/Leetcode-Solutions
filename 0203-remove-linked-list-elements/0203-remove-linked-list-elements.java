// public class ListNode{
//         int val;
//         ListNode next;
//         public ListNode(int val,ListNode next){
//             this.val=val;
//             this.next=next;
//         }
//         public ListNode(int val){
//             this.val=val;
//             this.next=null;
//         }
// }
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode curr=dummy;
        while(curr.next!=null){
            if(curr.next.val==val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
        return dummy.next;
    }
}