class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> lst=new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            String num=Integer.toString(nums[i]);
            for (int j=0;j<num.length();j++){
                lst.add(Character.getNumericValue(num.charAt(j)));
            }
        }
        int[] ans=new int[lst.size()];
        for (int i=0;i<lst.size();i++){
            ans[i]=lst.get(i);
        }
        return ans;
    }
}