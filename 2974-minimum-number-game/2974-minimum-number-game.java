class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int ans[]=new int[nums.length];
        int idx=0;
        for (int i=0;i<nums.length-1;i+=2){
            int t=nums[i];
            ans[i]=nums[i+1];
            ans[i+1]=t;
        }
        return ans;
    }
}