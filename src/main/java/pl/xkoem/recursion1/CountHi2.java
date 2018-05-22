package pl.xkoem.recursion1;

public class CountHi2 {
    public int countHi2(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.charAt(1) == 'h' && str.charAt(2) == 'i' && str.charAt(0) != 'x') {
            return 1 + countHi2(str.substring(3));
        } else if (str.charAt(1) == 'h' && str.charAt(2) == 'i' && str.charAt(0) == 'x') {
            return countHi2(str.substring(3));
        } else if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            return 1 + countHi2(str.substring(1));
        }
        return countHi2(str.substring(1));
    }
}
