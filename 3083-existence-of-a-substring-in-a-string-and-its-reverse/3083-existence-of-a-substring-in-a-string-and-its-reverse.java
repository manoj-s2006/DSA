class Solution {
    public boolean isSubstringPresent(String s) {
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }

        for(int i=0;i<s.length()-1;i++){
            String x=s.substring(i,i+2);
            if(ans.contains(x))  return true;
        }
        return false;
    }
}