class Solution {
    public int diagonalPrime(int[][] mat) {
      int max=0;
      for(int i=0;i<mat.length;i++){
        for(int j=0;j<mat[0].length;j++){
            if(i==j || i+j==mat.length-1){
                 if(check(mat[i][j])){
                    max=Math.max(max,mat[i][j]);
                 }
            }
        }
      }  return max;
    }
    boolean check(int num){
        if(num<2)return false;
        for(int i=2;i*i<=num;i++){
           if(num%i==0)return false;
        }
        return true;
    }
}