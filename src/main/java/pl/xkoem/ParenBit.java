package pl.xkoem;

public class ParenBit {
    public String parenBit(String str) {
        if (str.equals("()")) {
            return str;
        }
        if (str.charAt(1) == ')') {
            return ")";
        }
        if (str.charAt(0) != '(' && str.charAt(0) != '[') {
            return parenBit(str.substring(1));
        }
        if (str.charAt(0) == '(') {
            return "(" + str.charAt(1) + parenBit("[" + str.substring(2));
        }
        return str.charAt(1) + parenBit("[" + str.substring(2));
    }
}
