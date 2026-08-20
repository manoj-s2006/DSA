class Solution {
    public String largestNumber(int[] nums) {
        String []s=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b)->{
            String c=a+b;
            String d=b+a;
            return d.compareTo(c);
        });
        if(s[0].equals("0")) return "0";
        StringBuilder sd= new StringBuilder();
        for(String i:s){
            sd.append(i);
        }
        return sd.toString(); 
    }
}