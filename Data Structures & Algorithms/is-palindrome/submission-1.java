class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<l;i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        String res = sb.toString();
        res=res.toLowerCase();
        int st=0;
        int end=res.length()-1;
        while(st<=end){
            if(res.charAt(st)==res.charAt(end)){
                st++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
