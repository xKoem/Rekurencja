package pl.xkoem.recursion1;

public class PairStar {
    public String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }
        String newString;
        if (str.charAt(str.length()-2) == str.charAt(str.length() - 1)) {
            newString = "*" + str.charAt(str.length() - 1);
        } else {
            newString = "" + str.charAt(str.length() - 1);
        }

        return pairStar(str.substring(0, str.length() -1)) + newString;
    }
}
