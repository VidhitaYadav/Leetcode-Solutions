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
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode evenHead=null,evenTail=null;
        ListNode oddHead=null,oddTail=null;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val%2==0){
                if(evenHead==null){
                    evenHead=curr;
                    evenTail=curr;
                }else{
                    evenTail.next=curr;
                    evenTail=curr;
                }
            }else{
                if(oddHead==null){
                    oddHead=curr;
                    oddTail=curr;
                }else{
                    oddTail.next=curr;
                    oddTail=curr;
                }
            }
            curr=curr.next;
        }
        if(evenHead==null)return oddHead;
        if(oddHead==null)return evenHead;
        evenTail.next=oddHead;
        oddTail.next=null;
        return evenHead;

    }
}