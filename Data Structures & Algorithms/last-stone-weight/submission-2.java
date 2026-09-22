// 1. Create max heap
// Reapeat this while heap size is greater than 1

// 2. add all elements from stones to max heap
// 3. remove (poll) top 2 elements from heap and store
//     a. set first one equal to higher
//     b. set second one equal to lower
// 4. if higher equals lower remove both elements from priority queue
// 5. if lower is less than higher, add new weight (higher - lower) and 
// remove both elements (lower and higher) from array 
// 6. remove element from the pq or if pq is empty return 0

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num: stones) {
            pq.add(num);
        }
        
        while (pq.size() > 1) {
            int higher = pq.poll();
            int smaller = pq.peek();
            
            if (higher == smaller) {
                pq.remove(smaller);
            } else if (smaller < higher) {
                pq.add(higher - smaller);
                pq.remove(smaller);
            }
        }
        if (pq.size() == 0) {
            return 0;
        } else {
            return pq.peek();
        }
    }
}
