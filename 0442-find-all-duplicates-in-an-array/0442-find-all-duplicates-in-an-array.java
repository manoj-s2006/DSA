class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ls=new ArrayList<>();
        Set<Integer>s=new HashSet<>();
        for(int i:nums){
           if( s.contains(i)){
            ls.add(i);
           }
           s.add(i);
        }
        return ls;
    }
}