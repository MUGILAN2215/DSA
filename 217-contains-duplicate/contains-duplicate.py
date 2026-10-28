class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        res=set()
        for num in nums:
            if num in res:
                return True
            res.add(num)

        return False

        