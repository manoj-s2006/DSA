class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            boolean b=check(count);
            if(b)return true;
        }
        return false;
        
    }
    boolean check(int count){
        if(count==0) return false;
        int c1=0;
        for(int i=1;i<=count;i++){
            if(count%i==0){
                c1++;
            }
        }
        return c1==2;
    }
}