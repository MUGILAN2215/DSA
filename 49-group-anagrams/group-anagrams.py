class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        res=defaultdict(list)
        for s in strs:
            t=''.join(sorted(s))
            
            res[t].append(s)
            
        return list(res.values())


        