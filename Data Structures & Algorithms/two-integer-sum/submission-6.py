class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map = {}
        result = []

        for i in range(len(nums)):
            num = nums[i]
            complement = target - num
            
            if complement in map:
                result.append(map.get(complement))
                result.append(i)
            
            map[num] = i

        return result

