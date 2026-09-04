class Solution {

    public int findComplement(int num) {
        int ans = 0;
        int p = 1;
        while (num > 0) {
            int bit = num % 2;
            if (bit == 0) ans += p;
            num = num / 2;
            p = p * 2;
        }
        return ans;
    }
}