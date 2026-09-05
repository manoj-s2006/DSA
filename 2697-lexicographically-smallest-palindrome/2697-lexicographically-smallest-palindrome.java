class Solution {
    public String makeSmallestPalindrome(String s) {
        char ans[]=s.toCharArray();
        int n=ans.length;
        int i=0;
        int j=n-1;
        while(i<n/2){
            if(ans[i]!=ans[j]){
                  if(ans[i]>ans[j])ans[i]=ans[j];  
                else ans[j]=ans[i];  
            }
            i++;
            j--;
        }

     return new String(ans);
    }
}