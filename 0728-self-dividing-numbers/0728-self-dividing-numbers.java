class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> a=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int n=i;
            boolean b=true;
            while(n>0){
                int t=n%10;
                if(t==0||i%t!=0)
                 {
                    b=false;
                    break ;}
                  n/=10;  
            }
            if(b) a.add(i);
            } 

        
        return a;
    }
}