class duplicates{
    public int removeDuplicates(int[] nums) {
        int j=0;
        for (int i=1;i<nums.length;i++){
            if(nums[i]!=nums[j]){
                nums[++j]=nums[i];
            }
        }
        return ++j;
    }
    public static void main(String[] args) {
        duplicates obj=new duplicates();
        int[]nums={1,1,2,2,3,4,4,5};
        int length=obj.removeDuplicates(nums);
        for(int i=0;i<length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}