class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head,fast=head;
        for(int i=0;i<k-1;i++)
        {
            fast=fast.next;
        }
        ListNode first=fast;
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;

        }
        int x=first.val;
        first.val=slow.val;
        slow.val=x;
        return head;
        
    }
}
