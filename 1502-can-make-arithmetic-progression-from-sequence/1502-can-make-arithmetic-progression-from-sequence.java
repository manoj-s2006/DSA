class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
       Arrays.sort(arr);
       Set<Integer> s= new HashSet<>();
       for(int i=0;i<arr.length-1;i++){
        s.add(arr[i]-arr[i+1]);
       } 
       return s.size()==1;
    }
}