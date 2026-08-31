class Solution {
    public int minimumDeletions(int[] nums) {
        int min=nums[0];
        int max=nums[nums.length-1];
        int minele=Integer.MAX_VALUE;
        int maxele=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minele){
                minele=nums[i];
                min=i;
            }
        }
        for(int i=0;i<nums.length;i++){
              if(nums[i]>maxele){
                maxele=nums[i];
                max=i;
              }
        }
        int var=Math.max(min,max)+1;
        int var1=nums.length-(Math.min(min,max));
        int var3=(Math.min(min,max)+1)+nums.length-(Math.max(min,max));


    return Math.min(var,Math.min(var1,var3));
    }
}