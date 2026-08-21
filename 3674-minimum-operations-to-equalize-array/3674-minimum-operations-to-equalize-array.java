class Solution {
    public int minOperations(int[] nums) {
      Set<Integer>st=new HashSet<>();
      for(int i=0;i<nums.length;i++){
        st.add(nums[i]);
      } 
      if(st.size()==1) return 0;

      return 1; 
    }
}