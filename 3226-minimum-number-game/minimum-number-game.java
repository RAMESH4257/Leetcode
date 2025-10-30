class Solution {
    public int[] numberGame(int[] nums) {
        // 1st method
    //    int idx=0;
    //     Arrays.sort(nums);
    //     int arr[]=new int[nums.length];
    //     //int idx=0;
    //     for(int i=0;i< nums.length-1;i++){
    //         int a=nums[i];
    //         int b=nums[i+1];
    //         i+=1;
    //         arr[idx++]=b;
    //         arr[idx++]=a;
    //     }
    //     return arr;

    // 2nd method
    Queue<Integer> pq=new PriorityQueue<>();
    int arr[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        pq.add(nums[i]);
    }
    int idx=0;
    while(pq.size()>0){
        int alice=pq.poll();
        int bob=pq.poll();
        arr[idx++]=bob;
        arr[idx++]=alice;
    }
    return arr;
    }
}