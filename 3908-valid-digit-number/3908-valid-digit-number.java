class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        String s1=String.valueOf(x);
        if(s1.charAt(0)==s.charAt(0)){
           return false;
        }
        int temp=n;
        int a=Integer.parseInt(s);
        int b=Integer.parseInt(s1);
        while(temp!=0){
            int num=temp%10;
            if(num==x) return true;
            temp/=10;
        }
 return false;
    }
}