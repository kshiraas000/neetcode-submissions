class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;
    int nums[];

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;

        for(int i = 0; i < nums.length; i++) {
            pq.add(nums[i]);    
        }

        while(pq.size() > k) {
            pq.remove();
        }

    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > k) {
            pq.poll();
        }
        return pq.peek();
    }
}
