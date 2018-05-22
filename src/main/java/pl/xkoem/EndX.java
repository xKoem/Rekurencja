package pl.xkoem;

public class EndX {
    public String endX(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.charAt(0) == 'x') {
            str = str.substring(1,str.length());
            str += 'x';
            return endX(str.substring(0, str.length() -1 )) + 'x';
        } else {
            return str.charAt(0) + endX(str.substring(1,str.length()));
        }
    }
}
