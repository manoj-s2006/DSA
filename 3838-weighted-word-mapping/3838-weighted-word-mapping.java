class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(String w:words){
            int sum=0;
            for(int i=0;i<w.length();i++){
                sum+=weights[w.charAt(i)-'a'];
            }
            int m=sum%26;
            char t=(char)('z'-m);
            ans+=t;
        }
        return ans;
    }
}