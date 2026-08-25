class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n: nums1){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer> result=new ArrayList<>();
        for(int n:nums2){
            if(map.containsKey(n)&&map.get(n)>0){
                result.add(n); 
                map.put(n,map.getOrDefault(n,0)-1);
            }
        }

        int[] arr=new int[result.size()];
        int i=0;
        for(int n:result){
            arr[i]=n;
            i++;
        }
        return arr;

    }
}