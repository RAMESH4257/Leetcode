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
    public int getDecimalValue(ListNode head) {
         String ans="";
        while(head!=null){
          int k=head.val;
          String temp=Integer.toString(k);
          ans+=temp;
          head=head.next;
        }
        int k=Integer.parseInt(ans,2);
        return k;
    }
}