class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        String ans="";
        for(int i=0;i<s.length();i++){
            int j=i;
            int count=0;
            while(j<s.length()&& count<k){
                if(s.charAt(j)=='1'){count++;}
                
                j++; 
            }
              
            if(count==k){
                String s1=s.substring(i,j);
                if(ans.equals("")) ans=s1;
                else if(s1.length()<ans.length())ans=s1;
                else if(s1.length()==ans.length() && s1.compareTo(ans)<0) ans=s1;
            }

        }
        return ans;
    }
}