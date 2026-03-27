class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == 0) return nums;

        Map<Integer , Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num , count.getOrDefault(num , 0) + 1);
        }
        Queue<Integer> queue = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b)
        );
        for(int n : count.keySet()){
            queue.add(n);
            if(queue.size() > k){
                queue.poll();
            }
        }
        int[] ans  = new int[k];
        for(int i = 0 ; i<k ; i++){
            ans[i] = queue.poll();
        }
        return ans;
    }
}
