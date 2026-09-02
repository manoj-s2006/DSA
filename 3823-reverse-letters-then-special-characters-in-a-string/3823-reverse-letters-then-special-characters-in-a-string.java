class Solution {
    public String reverseByType(String s) {
        List<Character>ch=new ArrayList<>();
        List<Character>spch=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                ch.add(s.charAt(i));
            }
            else spch.add(s.charAt(i));
        }
        String ans="";
        int a=ch.size()-1;
        int b=spch.size()-1;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                ans+=ch.get(a);
                a--;
            }
            else {
                ans+=spch.get(b);
                b--;}

        }
        return ans;
    }
}