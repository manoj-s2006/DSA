class maximumproduct{
    public static void main(String[] args) {
       int[] nums={2,1};
         int max1=Integer.MAX_VALUE;
         int count=0;
         for(int i=0;i<nums.length;i++){
             if(nums[i]<max1){
                 max1=nums[i];
             }
             count++;
             if(count==2){
                 System.out.println(Math.max (nums[i],max1));
             }
         }
         
         System.out.println(max1);

    }
}