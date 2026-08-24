class Solution {
    public String[] sortPeople(String[] arr, int[] h) {
        Map<Integer,String>x=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            x.put(h[i],arr[i]);
        }
        Arrays.sort(h);
        int p=0;
        int p1=h.length-1;
        while(p<p1){
            int temp=h[p];
            h[p]=h[p1];
            h[p1]=temp;
            p++;
            p1--;
        }
//

   int k=0;
        for(int val:h){
           arr[k]=x.get(val);
           k++;
        }
        return arr;
        
    }
}