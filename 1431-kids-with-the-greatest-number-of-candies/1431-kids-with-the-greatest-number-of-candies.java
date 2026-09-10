class Solution {
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        List<Boolean>ls=new ArrayList<>();
        int max=0;
        for(int i=0;i<c.length;i++){
            max=Math.max(c[i],max);
        }
        for(int i=0;i<c.length;i++){
            if(c[i]+e>=max)ls.add(i,true);
            else ls.add(i,false);
        }
        return ls;
    }
}