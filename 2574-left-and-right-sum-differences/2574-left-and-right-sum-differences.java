class Solution {
    public int[] leftRightDifference(int[] nums) {
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int leftsum=0;
            int rightsum=0;
            for(int j=0;j<i;j++){
                leftsum+=nums[j];
            }
            for(int k=nums.length-1;k>i;k--){
                rightsum+=nums[k];
            }
            ans[i]=Math.abs(leftsum-rightsum);
        }return ans;
    }
}