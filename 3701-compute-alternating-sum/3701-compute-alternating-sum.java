class Solution {
    public int alternatingSum(int[] nums) {
        int ans=0;
        int ans1=0;
        for (int i=0;i<nums.length;i++){
            if(i%2==0)ans+=nums[i]; 
            else ans1+=nums[i];
        }
        return ans-ans1;
    }
}