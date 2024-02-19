import java.math.BigInteger;
import java.util.HashMap;

public class Main {
    public static HashMap<Long, BigInteger> memo = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i + " Fib: " + fibonacci(i));
        }
    }

    public static BigInteger fibonacci(long n) {
        if (n < 2) {
            return BigInteger.valueOf(n);
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }

        BigInteger fibValue = fibonacci(n - 1).add(fibonacci(n - 2));
        memo.put(n, fibValue);
        return fibValue;
    }
}