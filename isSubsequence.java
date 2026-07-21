class isSubsequence{
    public static void main(String[]args){
        String s="acb";
        String t="ahbgdc";
        int i=0;
        for(int j=0;j<t.length() && i<s.length();j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        if(i==s.length()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}