class Solution {
    public boolean halvesAreAlike(String s) {
        String s1=s.substring(0,s.length()/2);
        String s2=s.substring(s.length()/2,s.length());
        String v="aeiouAEIOU";
        int count=0;
        int count1=0;
        for (int i=0;i<s1.length();i++){
            if (v.indexOf(s1.charAt(i))!=-1){
                count++;
            }
        }
        for (int i=0;i<s2.length();i++){
            if (v.indexOf(s2.charAt(i))!=-1){
                count1++;
            }
        }
        return count==count1;
    }
}