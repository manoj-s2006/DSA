class AddStrings{
    public static void main(String[]args){
        String num1= "123";
        String num2= "456";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0||carry!=0){
            int d1=(i>=0)?num1.charAt(i)-'0':0;
            int d2=(j>=0)?num2.charAt(j)-'0':0;
            int sum=d1+d2+carry;
              carry=sum/10;
            sb.append(sum%10);
            i--;
            j--;
            
        }
        System.out.println(sb.reverse().toString());
    }
}