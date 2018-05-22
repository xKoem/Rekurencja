package pl.xkoem.recursion1;

public class ChangeXY {
    public String changeXY(String str) {
        if (str.length() == 0) {
            return "";
        }
        char actualChar = str.charAt(str.length()-1);

        if (actualChar == 'x') {
            actualChar = 'y';
        }

        str = changeXY(str.substring(0, str.length()-1));
        str+= actualChar;
        return str;
    }
}
