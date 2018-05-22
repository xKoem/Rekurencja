package pl.xkoem.recursion1;

public class SumDigits {
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        int digit = n%10;
        return digit + sumDigits(n/10);
    }
}
