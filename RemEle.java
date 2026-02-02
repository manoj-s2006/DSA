class RemEle {
    public int removeElement(int[] nums, int val) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
        
    }
    public static void main(String[] args) {
        RemEle obj=new RemEle();
        int[]nums={3,2,2,3,4,5,3};
        int val=3;
        int length=obj.removeElement(nums, val);
        for(int i=0;i<length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
