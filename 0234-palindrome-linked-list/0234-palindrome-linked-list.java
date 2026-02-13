class Solution {
    public ListNode reverseLL(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode newNode=reverseLL(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newNode;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode newHead=reverseLL(slow.next);
        ListNode first=head;
        ListNode second=newHead;
        while (second != null) {
            if (first.val != second.val) {
                reverseLL(newHead);  
                return false;
            }
            first = first.next;  
            second = second.next; 
        }
        reverseLL(newHead);
        return true;
    }
}