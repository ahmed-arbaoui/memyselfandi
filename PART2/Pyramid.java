package comm.aar.test;

import java.math.BigInteger;

public class Pyramid {

    public static void main(String[] args) {

        System.out.println(get(4, 2));
        System.out.println(get(5, 0));
        System.out.println(get(67, 34));
    }

    public static BigInteger factorial(BigInteger number) {
        BigInteger result = BigInteger.valueOf(1);

        for (long factor = 2; factor <= number.longValue(); factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }

        return result;
    }

    public static String get(int l, int c) {

        if (c == 0 || c == 1)
            return "1";
        if (c == 1 || c == l - 1)
            return String.valueOf(l);
        if (c == 2 || c == l - 2)
            return String.valueOf( l * (l - 1) / 2);

        BigInteger u = factorial(BigInteger.valueOf(l));
        BigInteger v = factorial(BigInteger.valueOf(c));
        BigInteger w = factorial(BigInteger.valueOf(l - c));
        BigInteger r = u.divide(v);
        
        return r.divide(w).toString();

    }

} 