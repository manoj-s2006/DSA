class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> lst=new ArrayList<>();
        for (int i=0;i<words.size();i++){
            String temp=words.get(i);
            String arr[]=temp.replace(separator,' ').split(" ");
            for (int j=0;j<arr.length;j++){
                if (arr[j].length()>0){
                    lst.add(arr[j]);
                }
            }
        }

        return lst;
    }
}