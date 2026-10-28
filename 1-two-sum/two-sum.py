class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        res={}
        for i,num in enumerate(nums):
            diff=target-num
            if diff in res:
                return[i,res[diff]]

            res[num]=i
        
        