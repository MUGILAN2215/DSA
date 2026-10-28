class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        res={}
        if len(s)!=len(t):
            return False
        
        for ch in s:
            res[ch]=res.get(ch,0)+1
        for ch in t:
            if ch not in res:
                return False
            res[ch]-=1

        for count in res.values():
            if count!=0:
                return False
        return True

        