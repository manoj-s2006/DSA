class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length-1;i++){
            int sum=0;
            int sum1=0;
            for (int j=0;j<=i;j++){
                sum+=nums[j];
            }
            for (int k=i+1;k<nums.length;k++){
                sum1+=nums[k];
            }
            if (Math.abs(sum-sum1)%2==0)count++;
            
        }
        return count;
    }
}