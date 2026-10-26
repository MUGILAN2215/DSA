class Solution:
    def runningSum(self, nums: list[int]) -> list[int]:
        result=[]
        total=0
        for n in nums:
            total+=n
            result.append(total)
        return result

        