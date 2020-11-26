package DivideTwoIntegers;

class divideIntegers {

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) { // return infinity when divisor is 0
            return Integer.MAX_VALUE;
        }
        if (dividend == 0) { // return 0 when dividend is 0
            return 0;
        }
        if (divisor == 1) { // return dividend directly when divisor is 1
            return dividend;
        }
        if (divisor == -1) { // handle integer range if divisor is -1
            return dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : - dividend;
        }
        // get the sign and do 'i' division on abstract values
        final boolean isNegative = (dividend > 0 && divisor < 0) || (dividend < 0 && divisor > 0);
        long longDividend = Math.abs((long) dividend);
        final long longDivisor = Math.abs((long) divisor);
        int res = 0;
        for (int i = Integer.SIZE - 1; i >= 0 && longDividend >= longDivisor; i--) {
            if (longDividend >= (longDivisor << i)) {
                res |= (1 << i);
                longDividend -= (longDivisor << i);
            }
        }
        return isNegative ? -res : res;
    }

    public static void main(String[] args) {

        int aDividend = 10;
        int bDivisor = 3;

        System.out.println(divide(aDividend, bDivisor));

        aDividend = 7;
        bDivisor = -3;

        System.out.println(divide(aDividend, bDivisor));

    }
}
