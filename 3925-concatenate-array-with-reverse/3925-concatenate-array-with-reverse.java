class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n=nums.length;
        int[]ans = new int[n*2];
        int idx=0;
        for(int i = 0; i < n; i++){
            ans[idx++] = nums[i]; 
        }
        for(int i = n-1; i >= 0; i--){
            ans[idx++] = nums[i]; 
        }

        return ans;
    }
}