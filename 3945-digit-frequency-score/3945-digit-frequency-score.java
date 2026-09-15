class Solution {
    public int digitFrequencyScore(int n) {
        int a=0;
        while(n!=0){
            int temp=n%10;
            a+=temp;
            n/=10;
        }
        return a;
    }
}