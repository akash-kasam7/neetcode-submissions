class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int res=0;
        for(int n: nums){
            set.add(n);
        }
        for(int i: nums){
            if(set.contains(i) && !set.contains(i-1)){
                int cur=i;
                int count=0;
                while(set.contains(cur)){
                    cur++;
                    count++;
                }
                res=Math.max(res,count);
            }
        }
        return res;
    }
}
