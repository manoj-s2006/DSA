class Solution {
    public int[] sortByBits(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int a=Integer.bitCount(arr[i]);
                int b=Integer.bitCount(arr[j]);
                if(a>b){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
                if(a==b && arr[i]>arr[j]){
                    int t=arr[j];
                    arr[j]=arr[i];
                    arr[i]=t;
                }
            }
        }
        return arr;
    }
}