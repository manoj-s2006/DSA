class Solution {
    public int[] resultArray(int[] nums) {
       int arr[]=new int[nums.length];
        List<Integer>l=new ArrayList<>();
        List<Integer>l1=new ArrayList<>();
        l.add(nums[0]);
        l1.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(l.get(l.size()-1)>l1.get(l1.size()-1)){
                l.add(nums[i]);
            }
            else{
                l1.add(nums[i]);
            }
        }
        int k=0;
        for(int i=0;i<l.size();i++){
            arr[k++]=l.get(i);
        }for(int i=0;i<l1.size();i++){
            arr[k++]=l1.get(i);
        }
        return arr;


        
    }
}