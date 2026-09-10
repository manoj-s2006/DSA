class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans=0;
        for(int i=0;i<words.length;i++){
           String s=words[i];
           int c=0;
           for(int j=0;j<s.length();j++){
            if(allowed.indexOf(s.charAt(j))!=-1){
                c++;
            }
           }
           if(c==s.length()){
            ans++;
           }
        }
        return ans;
    }
}