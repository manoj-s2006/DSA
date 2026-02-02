class Sumofarray {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
        
    }
    public static void main(String[] args) {
        Sumofarray obj=new Sumofarray();
        int[]nums={1,2,3,4};
        int[] result=obj.runningSum(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}