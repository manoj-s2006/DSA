class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       
        int ans[]=new int[A.length];
      

        for(int i=0;i<A.length;i++){
            int c=0;
            List<Integer> lt=new ArrayList<>();
            List<Integer> lt1=new ArrayList<>();
            for(int j=0;j<=i;j++){
                lt.add(A[j]);
                lt1.add(B[j]);
            }
            System.out.println(lt);
            System.out.println(lt1);
            for(int k=0;k<lt.size();k++){
                if(lt1.contains(lt.get(k))){
                    c++;
                }
            }
            ans[i]=c;  
        }
        return ans;
    }
}