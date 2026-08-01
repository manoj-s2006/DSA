class SumofDigitsinBaseK {
    public static void main(String[] args) {
        int n = 42;
        int k = 2;
        //expected 3 as output because 42 in base 2 is 101010 and sum of digits is 1+0+1+0+1+0=3
        String str = Integer.toString(n, k);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            sum += Character.getNumericValue(str.charAt(i));
        }
        System.out.println("Sum of digits of " + n + " in base " + k + " is: " + sum);

        }
    }
