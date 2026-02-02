class firstoccurence {
    public int strStr(String haystack, String needle) {
        for(int i = 0, j = needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        firstoccurence obj=new firstoccurence();
        String haystack="hello";
        String needle="ll";
        int index=obj.strStr(haystack, needle);
        System.out.println(index);
    }
}