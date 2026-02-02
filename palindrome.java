import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=scanner.nextInt();
        int temp=a;
        int reversed=0;
        while (a != 0) {
            int digit = a % 10;
            reversed = reversed * 10 + digit;
            a /= 10;
        }
        if(temp==reversed){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
                }
 }}