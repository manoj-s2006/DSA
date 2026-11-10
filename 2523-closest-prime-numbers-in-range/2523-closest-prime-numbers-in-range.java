import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] closestPrimes(int left, int right) {
        // Step 1: Use Sieve of Eratosthenes to find all primes up to right
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        if (right >= 1) {
            isPrime[1] = false;
        }

        for (int p = 2; p * p <= right; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i <= right; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Step 2: Collect all prime numbers that lie within [left, right]
        List<Integer> primesInRange = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                primesInRange.add(i);
            }
        }

        // Step 3: Find the pair with the minimum difference
        if (primesInRange.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDiff = Integer.MAX_VALUE;
        int num1 = -1;
        int num2 = -1;

        for (int i = 1; i < primesInRange.size(); i++) {
            int diff = primesInRange.get(i) - primesInRange.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                num1 = primesInRange.get(i - 1);
                num2 = primesInRange.get(i);
            }
        }

        return new int[]{num1, num2};
    }
}