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
    public int[] nextLargerNodes(ListNode head) {
        //  ListNode temp=head;
        // int n=0;
        // while(temp!=null){
        //     n++;
        //     temp=temp.next;
        // }
        // int[] arr=new int[n];
        // temp=head;
        // int idx=0;
        // while(temp!=null){
        //     arr[idx++]=temp.val;
        //     temp=temp.next;
        // }
        // int[] ans=new int[n];
        // boolean isvalid=true;
        // for(int i=0;i<arr.length;i++){
        //     int j=i+1;
        //     int a=arr[i];
        //     while(j!=arr.length){
        //         if(arr[i]<arr[j]){
        //             ans[i]=arr[j];
        //             // j++;
        //             isvalid=false;
        //             break;
        //         }
        //         j++;
        //     }
        //     if(isvalid){
        //         ans[i]=0;
        //     }
        // }
        // return ans;
      // using stack
    // Step 1: Convert LinkedList to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int n = list.size();
        int[] ans = new int[n];

        // Step 2: Stack to store indices
        Stack<Integer> stack = new Stack<>();

        // Step 3: Process elements
        for (int i = 0; i < n; i++) {

            // If current element is greater, resolve previous ones
            while (!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                ans[stack.pop()] = list.get(i);
            }

            // Push current index
            stack.push(i);
        }

        return ans;
    }
}