class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!s.contains(i))return i;
        }
        return -1;
    }
}