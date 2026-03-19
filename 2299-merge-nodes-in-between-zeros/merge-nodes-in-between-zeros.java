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
    public ListNode mergeNodes(ListNode head) {
         ListNode temp=head;
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        int c=0;
        int sum=0;
        while(temp!=null){
            //int sum=0;
            //sum+=temp.val;
            if(temp.val==0){
                c++;
            }
            sum+=temp.val;
            if(c%2==0){
                ListNode newnode=new ListNode(sum);
                curr.next=newnode;
                curr=curr.next;
                sum=0;
                c+=1;
            }
            //c=0;
            temp=temp.next;
        }
        return dummy.next;
    }
}