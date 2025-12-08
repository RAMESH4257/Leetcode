class Solution {
    static boolean isPrime(int k){
        if(k < 2) return false;
        for(int j=2; j <= Math.sqrt(k); j++){
            if(k % j == 0) return false;
        }
        return true;
    }
    
    public boolean checkPrimeFrequency(int[] nums) 
    {
       HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i], hm.getOrDefault(nums[i],0) + 1);
        }

        boolean found = false;

        for(int key : hm.keySet())
        {
            int k = hm.get(key);
            if(isPrime(k))
            {
                found = true;
                break;
            }
        }

        return found;
    }
}