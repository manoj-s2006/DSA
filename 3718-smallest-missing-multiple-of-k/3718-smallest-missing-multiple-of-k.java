class Solution {
    public int missingMultiple(int[] nums, int k) {
        int temp=k;
        while(true){
            boolean a=false;
            for(int num:nums){
                if(num==temp){ 
                    a=true;
                 break;}
            }
            if(!a){
                return temp;
            }
            temp+=k;
        }
        
        
    }
}