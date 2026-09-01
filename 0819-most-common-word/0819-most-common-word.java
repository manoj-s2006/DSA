class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String s=paragraph.toLowerCase();
        Set<String> st=new HashSet<>();
        for (int i=0;i<banned.length;i++){
            st.add(banned[i]);
        }
        String arr[]=s.split("\\W+");

        Map<String,Integer> mp=new HashMap<>();

        for (int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }

        String ans="";
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(!st.contains(arr[i])&& mp.get(arr[i])>max){
                max=mp.get(arr[i]);
                ans=arr[i];
            }
        }

        return ans;
    }
}