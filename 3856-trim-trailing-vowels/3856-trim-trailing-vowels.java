class Solution {
    public String trimTrailingVowels(String s) {
        
        Stack<Character>st= new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        String a="aeiou";
        while(!st.isEmpty()){
            if(a.indexOf(st.peek())>=0){
                st.pop();
            }
            else{
                break;
            }
        }
        String s1="";
        for(char ch:st){
            s1+=ch;
        }
 return s1;
    }
}