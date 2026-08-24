class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
       int prod=1;
       int sum=0;
       while(n>0){
         int digit=n%10;
         prod*=digit;
         n/=10;
       }
       while(temp>0){
         int digit=temp%10;
         sum+=digit;
         temp/=10;
       }
       return prod-sum;
    }
}