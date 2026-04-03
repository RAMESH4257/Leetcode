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
    public ListNode partition(ListNode head, int x) {
        // ListNode temp=head;
        // ListNode dummy=new ListNode(0);
        // ListNode curr=dummy;
        // int n=0;
        // while(temp!=null){
        //     n++;
        //     temp=temp.next;
        // }
        // int[] ans=new int[n];
        // temp=head;
        // int idx=0;
        // while(temp!=null){
        //     if(temp.val<x){
        //         ans[idx++]=temp.val;
        //         //temp=temp.next;
        //     }
        //     temp=temp.next;
        // }
        // temp=head;
        // while(temp!=null){
        //     if(temp.val>=x){
        //         ans[idx++]=temp.val;
        //         //temp=temp.next;
        //     }
        //     temp=temp.next;
        // }
    
        // for(int i=0;i<ans.length;i++){
        //     ListNode newnode=new ListNode(ans[i]);
        //     curr.next=newnode;
        //     curr=newnode;
        // }
        // return dummy.next;
    // optimal using 2 pointers without extra space 
     ListNode smalldummy=new ListNode(0);
        ListNode bigdummy=new ListNode(0);
        ListNode small=smalldummy;
        ListNode big=bigdummy;
        while(head!=null){
            if(head.val<x){
                small.next=head;
                small=head;
            }else{
                big.next=head;
                big=head;
            }
            head=head.next;
        }
        big.next=null;
        small.next=bigdummy.next;
        return smalldummy.next;
    }
}