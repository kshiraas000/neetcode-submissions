class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        map = {}
        for n in nums:
            map[n] = map.get(n, 0) + 1

        sort = sorted(map.items(), key=lambda x:x[1], reverse = True)
        top_k = [key for key, value in sort[:k]]

        return top_k