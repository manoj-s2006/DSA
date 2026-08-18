class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int ans[]=new int[l];
        int left=0;
        int right=l/2;
        int t=0;
        while(left<l/2 && right<l){
            ans[t++]=nums[left];
            ans[t++]=nums[right];
            left++;
            right++;
        }
        return ans;
    }
}