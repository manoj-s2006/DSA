class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        String s1="";
        String s2="";
        for(String s:w1)s1+=s;
        for(String s:w2)s2+=s;
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equals(s2))return true;
        return false;
    }
}