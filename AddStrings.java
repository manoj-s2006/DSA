class AddStrings{
    public static void main(String[]args){
        String num1= "123";
        String num2= "456";
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }
            sb.append(sum%10);
            carry=sum/10;
        }
        System.out.println(sb.reverse());
    }
}