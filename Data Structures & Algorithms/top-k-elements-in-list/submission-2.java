class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fmap = new HashMap<>();
        for(int n: nums){
            fmap.put(n,fmap.getOrDefault(n,0)+1);
        }
        List<Integer>[] arr = new List[nums.length+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> e : fmap.entrySet()){
            arr[e.getValue()].add(e.getKey());                        
        }
        int f =0;
        int[] res = new int[k];
        // for(int n:arr){
        //     System.out.print(n);
        // }
       for(int i=arr.length-1;i>=0;i--){
           for(int n:arr[i]){
            res[f]=n;
            f++;
            if(f==k){
               return res; 
            }
           }
       }
       return res;
        
        
    }
}
