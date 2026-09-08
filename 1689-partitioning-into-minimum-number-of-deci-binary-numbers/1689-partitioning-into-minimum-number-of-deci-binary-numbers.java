class Solution {
    public int minPartitions(String s) {
        int max=0;
        for (int i=0;i<s.length();i++){
            int temp=s.charAt(i)-'0';
            if (temp>max)max=temp;}
        
        return max;
    }
}