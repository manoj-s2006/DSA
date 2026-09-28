class Solution {
    public int maxDepth(String s) {
        int left=0;
        int right=0;
        Stack<Character> st=new Stack<>();
        int i=0;
        int max=0;

        while(i<s.length()){
            if (s.charAt(i)=='('){
                    st.push(s.charAt(i));
                    left++;                
            }
            
            if (s.charAt(i)==')'){
                    st.pop();
                    left--;
            }
            max=Math.max(left,max);
            i++;

        }

        return max;
    }
}