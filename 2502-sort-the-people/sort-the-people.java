class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int idx = 0;
        
        String[] ans = new String[names.length];
    
        int[] arr = new int[heights.length];
        for (int i : heights) {
            arr[idx++] = i;
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            hm.put(names[i] + i, heights[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            for (String l : hm.keySet()) {
                int g = hm.get(l);
                if (arr[i] == g) {
                    ans[i] = l.replaceAll("[0-9]", ""); 
                    break;
                }
            }
        }
      return ans;
    }
}