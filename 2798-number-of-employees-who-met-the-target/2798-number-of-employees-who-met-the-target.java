class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] h, int t) {
       int count=0;
       for(int i=0;i<h.length;i++){
        
            if(h[i]>=t)count++;
        }
        return count;
    }
}