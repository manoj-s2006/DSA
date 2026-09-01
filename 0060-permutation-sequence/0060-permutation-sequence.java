class Solution {
    public String getPermutation(int n, int k) {
        StringBuilder str=new StringBuilder();
        ArrayList<Integer> num=new ArrayList<>();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            num.add(i);
        }

        k--;
        for(int i=0;i<n;i++){
            fact=fact/(n-i);
            int idx=(k/fact);
            str.append(num.remove(idx));
            k=k%fact;
        }

        return str.toString();
    }
}