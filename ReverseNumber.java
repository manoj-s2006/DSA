import java.util.Scanner;
public class ReverseNumber {
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
        System.out.println( reversed);
                }
 }

        
        
       
        

