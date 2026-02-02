class lastword {
    public int lengthOfLastWord(String s) {
        String a[]=s.split(" ");
        String ans=a[a.length-1];
        return ans.length();
    }
    public static void main(String[] args) {
        lastword obj=new lastword();
        String s="Hello World";
        int length=obj.lengthOfLastWord(s);
        System.out.println(length);
    }
}