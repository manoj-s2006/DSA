class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n=0;
        while(n<bits.length-1){
            n+=bits[n]+1;
        }
        return bits.length-1==n;
    }
}