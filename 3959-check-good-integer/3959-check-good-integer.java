class Solution {
    public boolean checkGoodInteger(int n) {
        int sum=0;
        int squaresum=0;
        while(n!=0){
            int temp=n%10;
            sum+=temp;
            squaresum+=Math.pow(temp,2);
            n/=10;
                
    }
    if(squaresum - sum >=50) return true;

    return false;
    }
}