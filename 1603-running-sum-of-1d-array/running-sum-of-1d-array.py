class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        res=[]
        total=0
        for num in nums:
            total+=num
            res.append(total)
        return res
            
        