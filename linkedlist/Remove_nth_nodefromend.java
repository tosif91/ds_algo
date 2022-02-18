package linkedlist;

public class Remove_nth_nodefromend {
    public class ListNode {
        int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
     public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
         
         ListNode temp = new ListNode(0);
         ListNode slow = temp;
         temp.next = head;
         ListNode fast = head;
         
         for(int i=0;i<n;i++){
             fast = fast.next;
         }
         
         while(fast != null){
             slow = slow.next;
             fast = fast.next;
         }
         
         slow.next = slow.next.next;
         
         return temp.next;
         
     }
}