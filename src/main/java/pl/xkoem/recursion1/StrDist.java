package pl.xkoem.recursion1;

public class StrDist {
    public int strDist(String str, String sub) {
        if (str.length() < sub.length()) {
            return 0;
        }
        if (str.substring(0, sub.length()).equals(sub)) {
            int stringLength = str.length();
            if (str.substring(stringLength - sub.length()).equals(sub))
                return stringLength;
            return strDist(str.substring(0, stringLength-1), sub);
        }
        return strDist(str.substring(1), sub);
    }
}
