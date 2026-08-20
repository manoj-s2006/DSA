class Solution {
    public int[] searchRange(int[] nums, int t) {
        int i=first(nums,t);
        int j=second(nums,t);
        int arr[]=new int[2];
        arr[0]=i;
        arr[1]=j;
        
    return arr;    
    }
    public static int first(int []nums, int t){
             int st=0;
             int ls=nums.length-1;
             int ans=-1;
             while(st<=ls){
                int mid=st+(ls-st)/2;
                if(nums[mid]==t){
                    ans=mid;
                    ls=mid-1;
                }
                else if(nums[mid]<t){
                    st=mid+1;
                }
                else ls=mid-1;
             }
             return ans;}
             public static int second(int []nums, int t){
             int st=0;
             int ls=nums.length-1;
             int ans=-1;
             while(st<=ls){
                int mid=st+(ls-st)/2;
                if(nums[mid]==t){
                    ans=mid;
                    st=mid+1;
                }
                else if(nums[mid]<t){
                    st=mid+1;
                }
                else ls=mid-1;
             }
             return ans;
          
    }
}