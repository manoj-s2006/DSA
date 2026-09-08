class Solution {
    public int maxRepeating(String se, String w) {
        int c=0;
        String s= w;
        while(se.contains(w)){
            c++;
            w+=s;
        }
        return c;
    }
}