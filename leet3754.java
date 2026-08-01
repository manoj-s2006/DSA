class leet3754{
    public static void main(String[] args) {
        int n=65463628;
        //expected output:2618545120
        String numStr = String.valueOf(n).replace("0", "");
        int sum = 0;
        for (int i = 0; i < numStr.length(); i++) {
             sum += numStr.charAt(i) - '0';
            }
            int num = Integer.parseInt(numStr);
            long result = (long)num * sum;
            System.out.println(result);
    }
}