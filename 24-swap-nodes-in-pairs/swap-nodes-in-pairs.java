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
    public ListNode swapPairs(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode first=null;
        ListNode second=null;
        ListNode ans=null;
        int c=0;
        ListNode link=null;
        while(temp.next!=null){
           first=temp;
           second=temp.next;
           first.next=second.next;
           second.next=null;
           // only once
           if(c==0){
              second.next=first;
           }
          // store the answer
           if(c==0){
              ans=second;
           }
           // link the previous swap nodes
           if(c>=1){
              link.next=second;
              second.next=first;
           }
           link=first;
           // temp will move until met the condition
           if(temp.next!=null){
              temp=first.next;
           }
           
            c++;
        }
        return ans;
    }
}