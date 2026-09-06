class Solution {
    public int possibleStringCount(String w) {
        int count=1;
        int j=1;
        for(int i=0;i<w.length()-1;i++){
            if(w.charAt(i)==w.charAt(j)){
                count++;
            }
            j++;
        }
        return count;
    }
}