package pl.xkoem.recursion1;

public class Count7 {
    public int count7(int n) {
        if (n == 0)
            return 0;

        int digit = n%10;
        int numberToAddToSum = 0;
        if (digit == 7)
            numberToAddToSum = 1;

        return numberToAddToSum +  count7(n/10);
    }
}
