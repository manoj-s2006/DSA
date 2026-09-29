class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        }
        int count=mp.get(s.charAt(0));
        for (int i=1;i<s.length();i++){
            if (count!=mp.get(s.charAt(i))){
                return false;
            }
        }
        return true;
    }
}