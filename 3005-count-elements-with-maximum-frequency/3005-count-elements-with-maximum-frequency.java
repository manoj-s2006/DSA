class Solution {
    public int maxFrequencyElements(int[] nums) {
        int count=0;
        int total=0;
        int max=0;
        Set<Integer> st= new HashSet<>();
        for (int i=0;i<nums.length;i++){
            count=0;
            for (int j=0;j<nums.length;j++){
                if (nums[i]==nums[j]){
                    count++;
                }
            }
            if (!st.contains(nums[i])){
                st.add(nums[i]);
            
            if (count>max){
                max=count;
                total=count;
            }
            else if (count==max){
                total+=count;
            }}
            
        }

        

        return total;
    }
}