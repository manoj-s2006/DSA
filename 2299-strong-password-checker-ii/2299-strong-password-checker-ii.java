class Solution {
    public boolean strongPasswordCheckerII(String p) {
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        for(int i=0;i<p.length();i++){
            if(i<p.length()-1 && p.charAt(i)==p.charAt(i+1)) return false;



            if(Character.isUpperCase(p.charAt(i)))a++;
            else if(Character.isLowerCase(p.charAt(i)))b++;
            else if(Character.isDigit(p.charAt(i)))c++;
            else d++;
        }
        return a>0 && b>0 && c>0 && d>0 && p.length()>=8;
    }
}