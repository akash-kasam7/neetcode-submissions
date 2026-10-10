class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if("+-*/".contains(tokens[i])){
                Integer r=st.pop();
                Integer l=st.pop();
                switch(tokens[i]){
                    case "+":
                        st.push(l+r);
                        break;
                    //System.out.println(st.peek());
                    case "-":
                        st.push(l-r);
                        break;
                    case "*":
                        st.push(l*r);
                        System.out.println(st.peek());
                        break;   
                    case "/":
                        st.push(l/r);
                        break;
                }
            }else{
                st.push(Integer.parseInt(tokens[i]));
                //System.out.println(tokens[i]);
            }
        }
        return st.pop();
    }
}
