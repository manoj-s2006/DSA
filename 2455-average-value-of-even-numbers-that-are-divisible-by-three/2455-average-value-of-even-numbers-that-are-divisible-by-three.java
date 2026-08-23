class Solution {
    public int averageValue(int[] nums) {
       int num=0;
       int len=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%6==0){
            num+=nums[i];
            len++;
        } 
       }
       if(num==0)return 0;
        int avg=num/len;
        return avg;
    }
}