class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int a=0;
        int b=0;
        for(int i=0;i<k;i++){
            a+=nums[i];
            b+=nums[nums.length-1-i];
        }
        return Math.abs(a-b);
        
    }
}