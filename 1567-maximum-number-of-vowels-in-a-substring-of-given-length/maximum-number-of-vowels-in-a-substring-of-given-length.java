class Solution {
    public int maxVowels(String s, int k) {
        int count =0;
        for(int i=0;i<k;i++){
            if(isVowels(s.charAt(i))){
                count++;
            }
        }
        int maxcount=count;

        for(int i=k;i<s.length();i++){
            if(isVowels(s.charAt(i))){
                count++;
            }
            if(isVowels(s.charAt(i-k))){
                count--;
            }

            maxcount=Math.max(count,maxcount);
        }

        return maxcount;

    }
    private boolean isVowels(char c){
        String vowel="aeiouAEIOU";
        if(vowel.indexOf(c)!=-1){
            return true;
        }
        return false;
    }
}