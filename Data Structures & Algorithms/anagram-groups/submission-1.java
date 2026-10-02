class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] carr= new char[26];
            for(char c: s.toCharArray()){
                carr[c-'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int n: carr){
                sb.append('#');
                sb.append(n);
            }
            String cs=sb.toString();
            if(!map.containsKey(cs)){
                List<String> lis = new ArrayList<>();
                lis.add(s);
                map.put(cs,lis);
            }else{
                map.get(cs).add(s);
            }
        }
        return new ArrayList<>(map.values());
       
        
    }
}
